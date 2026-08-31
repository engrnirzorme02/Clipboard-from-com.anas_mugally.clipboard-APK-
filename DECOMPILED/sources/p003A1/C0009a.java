package p003A1;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: A1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0009a implements Closeable {

    /* JADX INFO: renamed from: a */
    private final File f41a;

    /* JADX INFO: renamed from: b */
    private final File f42b;

    /* JADX INFO: renamed from: c */
    private final File f43c;

    /* JADX INFO: renamed from: d */
    private final File f44d;

    /* JADX INFO: renamed from: e */
    private final int f45e;

    /* JADX INFO: renamed from: f */
    private long f46f;

    /* JADX INFO: renamed from: r */
    private final int f47r;

    /* JADX INFO: renamed from: t */
    private Writer f49t;

    /* JADX INFO: renamed from: v */
    private int f51v;

    /* JADX INFO: renamed from: s */
    private long f48s = 0;

    /* JADX INFO: renamed from: u */
    private final LinkedHashMap f50u = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: w */
    private long f52w = 0;

    /* JADX INFO: renamed from: x */
    final ThreadPoolExecutor f53x = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: y */
    private final Callable f54y = new a();

    /* JADX INFO: renamed from: A1.a$a */
    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (C0009a.this) {
                try {
                    if (C0009a.this.f49t == null) {
                        return null;
                    }
                    C0009a.this.m37c1();
                    if (C0009a.this.m30U0()) {
                        C0009a.this.m35Z0();
                        C0009a.this.f51v = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: A1.a$b */
    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: A1.a$c */
    public final class c {

        /* JADX INFO: renamed from: a */
        private final d f56a;

        /* JADX INFO: renamed from: b */
        private final boolean[] f57b;

        /* JADX INFO: renamed from: c */
        private boolean f58c;

        /* synthetic */ c(C0009a c0009a, d dVar, a aVar) {
            this(dVar);
        }

        /* JADX INFO: renamed from: a */
        public void m54a() {
            C0009a.this.m45p0(this, false);
        }

        /* JADX INFO: renamed from: b */
        public void m55b() {
            if (this.f58c) {
                return;
            }
            try {
                m54a();
            } catch (IOException unused) {
            }
        }

        /* JADX INFO: renamed from: e */
        public void m56e() {
            C0009a.this.m45p0(this, true);
            this.f58c = true;
        }

        /* JADX INFO: renamed from: f */
        public File m57f(int i7) {
            File fileM70k;
            synchronized (C0009a.this) {
                try {
                    if (this.f56a.f65f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f56a.f64e) {
                        this.f57b[i7] = true;
                    }
                    fileM70k = this.f56a.m70k(i7);
                    C0009a.this.f41a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fileM70k;
        }

        private c(d dVar) {
            this.f56a = dVar;
            this.f57b = dVar.f64e ? null : new boolean[C0009a.this.f47r];
        }
    }

    /* JADX INFO: renamed from: A1.a$d */
    private final class d {

        /* JADX INFO: renamed from: a */
        private final String f60a;

        /* JADX INFO: renamed from: b */
        private final long[] f61b;

        /* JADX INFO: renamed from: c */
        File[] f62c;

        /* JADX INFO: renamed from: d */
        File[] f63d;

        /* JADX INFO: renamed from: e */
        private boolean f64e;

        /* JADX INFO: renamed from: f */
        private c f65f;

        /* JADX INFO: renamed from: g */
        private long f66g;

        /* synthetic */ d(C0009a c0009a, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: renamed from: m */
        private IOException m67m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public void m68n(String[] strArr) throws IOException {
            if (strArr.length != C0009a.this.f47r) {
                throw m67m(strArr);
            }
            for (int i7 = 0; i7 < strArr.length; i7++) {
                try {
                    this.f61b[i7] = Long.parseLong(strArr[i7]);
                } catch (NumberFormatException unused) {
                    throw m67m(strArr);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public File m69j(int i7) {
            return this.f62c[i7];
        }

        /* JADX INFO: renamed from: k */
        public File m70k(int i7) {
            return this.f63d[i7];
        }

        /* JADX INFO: renamed from: l */
        public String m71l() {
            StringBuilder sb = new StringBuilder();
            for (long j7 : this.f61b) {
                sb.append(' ');
                sb.append(j7);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f60a = str;
            this.f61b = new long[C0009a.this.f47r];
            this.f62c = new File[C0009a.this.f47r];
            this.f63d = new File[C0009a.this.f47r];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i7 = 0; i7 < C0009a.this.f47r; i7++) {
                sb.append(i7);
                this.f62c[i7] = new File(C0009a.this.f41a, sb.toString());
                sb.append(".tmp");
                this.f63d[i7] = new File(C0009a.this.f41a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* JADX INFO: renamed from: A1.a$e */
    public final class e {

        /* JADX INFO: renamed from: a */
        private final String f68a;

        /* JADX INFO: renamed from: b */
        private final long f69b;

        /* JADX INFO: renamed from: c */
        private final long[] f70c;

        /* JADX INFO: renamed from: d */
        private final File[] f71d;

        /* synthetic */ e(C0009a c0009a, String str, long j7, File[] fileArr, long[] jArr, a aVar) {
            this(str, j7, fileArr, jArr);
        }

        /* JADX INFO: renamed from: a */
        public File m72a(int i7) {
            return this.f71d[i7];
        }

        private e(String str, long j7, File[] fileArr, long[] jArr) {
            this.f68a = str;
            this.f69b = j7;
            this.f71d = fileArr;
            this.f70c = jArr;
        }
    }

    private C0009a(File file, int i7, int i8, long j7) {
        this.f41a = file;
        this.f45e = i7;
        this.f42b = new File(file, "journal");
        this.f43c = new File(file, "journal.tmp");
        this.f44d = new File(file, "journal.bkp");
        this.f47r = i8;
        this.f46f = j7;
    }

    /* JADX INFO: renamed from: K0 */
    private static void m26K0(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: R0 */
    private synchronized c m28R0(String str, long j7) {
        m41l0();
        d dVar = (d) this.f50u.get(str);
        a aVar = null;
        if (j7 != -1 && (dVar == null || dVar.f66g != j7)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f50u.put(str, dVar);
        } else if (dVar.f65f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f65f = cVar;
        this.f49t.append((CharSequence) "DIRTY");
        this.f49t.append(' ');
        this.f49t.append((CharSequence) str);
        this.f49t.append('\n');
        m29S0(this.f49t);
        return cVar;
    }

    /* JADX INFO: renamed from: S0 */
    private static void m29S0(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public boolean m30U0() {
        int i7 = this.f51v;
        return i7 >= 2000 && i7 >= this.f50u.size();
    }

    /* JADX INFO: renamed from: V0 */
    public static C0009a m31V0(File file, int i7, int i8, long j7) throws IOException {
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i8 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m36b1(file2, file3, false);
            }
        }
        C0009a c0009a = new C0009a(file, i7, i8, j7);
        if (c0009a.f42b.exists()) {
            try {
                c0009a.m33X0();
                c0009a.m32W0();
                return c0009a;
            } catch (IOException e7) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e7.getMessage() + ", removing");
                c0009a.m50w0();
            }
        }
        file.mkdirs();
        C0009a c0009a2 = new C0009a(file, i7, i8, j7);
        c0009a2.m35Z0();
        return c0009a2;
    }

    /* JADX INFO: renamed from: W0 */
    private void m32W0() throws IOException {
        m26K0(this.f43c);
        Iterator it = this.f50u.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i7 = 0;
            if (dVar.f65f == null) {
                while (i7 < this.f47r) {
                    this.f48s += dVar.f61b[i7];
                    i7++;
                }
            } else {
                dVar.f65f = null;
                while (i7 < this.f47r) {
                    m26K0(dVar.m69j(i7));
                    m26K0(dVar.m70k(i7));
                    i7++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    private void m33X0() {
        C0010b c0010b = new C0010b(new FileInputStream(this.f42b), AbstractC0011c.f79a);
        try {
            String strM76x = c0010b.m76x();
            String strM76x2 = c0010b.m76x();
            String strM76x3 = c0010b.m76x();
            String strM76x4 = c0010b.m76x();
            String strM76x5 = c0010b.m76x();
            if (!"libcore.io.DiskLruCache".equals(strM76x) || !"1".equals(strM76x2) || !Integer.toString(this.f45e).equals(strM76x3) || !Integer.toString(this.f47r).equals(strM76x4) || !"".equals(strM76x5)) {
                throw new IOException("unexpected journal header: [" + strM76x + ", " + strM76x2 + ", " + strM76x4 + ", " + strM76x5 + "]");
            }
            int i7 = 0;
            while (true) {
                try {
                    m34Y0(c0010b.m76x());
                    i7++;
                } catch (EOFException unused) {
                    this.f51v = i7 - this.f50u.size();
                    if (c0010b.m75n()) {
                        m35Z0();
                    } else {
                        this.f49t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f42b, true), AbstractC0011c.f79a));
                    }
                    AbstractC0011c.m77a(c0010b);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC0011c.m77a(c0010b);
            throw th;
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private void m34Y0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i7 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i7);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i7);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f50u.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i7, iIndexOf2);
        }
        d dVar = (d) this.f50u.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f50u.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f64e = true;
            dVar.f65f = null;
            dVar.m68n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f65f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public synchronized void m35Z0() {
        try {
            Writer writer = this.f49t;
            if (writer != null) {
                m44o0(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f43c), AbstractC0011c.f79a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f45e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f47r));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f50u.values()) {
                    if (dVar.f65f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f60a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f60a + dVar.m71l() + '\n');
                    }
                }
                m44o0(bufferedWriter);
                if (this.f42b.exists()) {
                    m36b1(this.f42b, this.f44d, true);
                }
                m36b1(this.f43c, this.f42b, false);
                this.f44d.delete();
                this.f49t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f42b, true), AbstractC0011c.f79a));
            } catch (Throwable th) {
                m44o0(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b1 */
    private static void m36b1(File file, File file2, boolean z7) throws IOException {
        if (z7) {
            m26K0(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public void m37c1() {
        while (this.f48s > this.f46f) {
            m49a1((String) ((Map.Entry) this.f50u.entrySet().iterator().next()).getKey());
        }
    }

    /* JADX INFO: renamed from: l0 */
    private void m41l0() {
        if (this.f49t == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: o0 */
    private static void m44o0(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public synchronized void m45p0(c cVar, boolean z7) {
        d dVar = cVar.f56a;
        if (dVar.f65f != cVar) {
            throw new IllegalStateException();
        }
        if (z7 && !dVar.f64e) {
            for (int i7 = 0; i7 < this.f47r; i7++) {
                if (!cVar.f57b[i7]) {
                    cVar.m54a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i7);
                }
                if (!dVar.m70k(i7).exists()) {
                    cVar.m54a();
                    return;
                }
            }
        }
        for (int i8 = 0; i8 < this.f47r; i8++) {
            File fileM70k = dVar.m70k(i8);
            if (!z7) {
                m26K0(fileM70k);
            } else if (fileM70k.exists()) {
                File fileM69j = dVar.m69j(i8);
                fileM70k.renameTo(fileM69j);
                long j7 = dVar.f61b[i8];
                long length = fileM69j.length();
                dVar.f61b[i8] = length;
                this.f48s = (this.f48s - j7) + length;
            }
        }
        this.f51v++;
        dVar.f65f = null;
        if (dVar.f64e || z7) {
            dVar.f64e = true;
            this.f49t.append((CharSequence) "CLEAN");
            this.f49t.append(' ');
            this.f49t.append((CharSequence) dVar.f60a);
            this.f49t.append((CharSequence) dVar.m71l());
            this.f49t.append('\n');
            if (z7) {
                long j8 = this.f52w;
                this.f52w = 1 + j8;
                dVar.f66g = j8;
            }
        } else {
            this.f50u.remove(dVar.f60a);
            this.f49t.append((CharSequence) "REMOVE");
            this.f49t.append(' ');
            this.f49t.append((CharSequence) dVar.f60a);
            this.f49t.append('\n');
        }
        m29S0(this.f49t);
        if (this.f48s > this.f46f || m30U0()) {
            this.f53x.submit(this.f54y);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public c m47Q0(String str) {
        return m28R0(str, -1L);
    }

    /* JADX INFO: renamed from: T0 */
    public synchronized e m48T0(String str) throws Throwable {
        Throwable th;
        try {
            try {
                m41l0();
                d dVar = (d) this.f50u.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f64e) {
                    return null;
                }
                for (File file : dVar.f62c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                this.f51v++;
                this.f49t.append((CharSequence) "READ");
                this.f49t.append(' ');
                this.f49t.append((CharSequence) str);
                this.f49t.append('\n');
                if (m30U0()) {
                    this.f53x.submit(this.f54y);
                }
                return new e(this, str, dVar.f66g, dVar.f62c, dVar.f61b, null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: a1 */
    public synchronized boolean m49a1(String str) {
        try {
            m41l0();
            d dVar = (d) this.f50u.get(str);
            if (dVar != null && dVar.f65f == null) {
                for (int i7 = 0; i7 < this.f47r; i7++) {
                    File fileM69j = dVar.m69j(i7);
                    if (fileM69j.exists() && !fileM69j.delete()) {
                        throw new IOException("failed to delete " + fileM69j);
                    }
                    this.f48s -= dVar.f61b[i7];
                    dVar.f61b[i7] = 0;
                }
                this.f51v++;
                this.f49t.append((CharSequence) "REMOVE");
                this.f49t.append(' ');
                this.f49t.append((CharSequence) str);
                this.f49t.append('\n');
                this.f50u.remove(str);
                if (m30U0()) {
                    this.f53x.submit(this.f54y);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f49t == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f50u.values())) {
                if (dVar.f65f != null) {
                    dVar.f65f.m54a();
                }
            }
            m37c1();
            m44o0(this.f49t);
            this.f49t = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m50w0() throws IOException {
        close();
        AbstractC0011c.m78b(this.f41a);
    }
}
