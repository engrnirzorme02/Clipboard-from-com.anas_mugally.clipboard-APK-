package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.p319io.FileSystem;
import okhttp3.internal.platform.Platform;
import p072I6.AbstractC0654k;
import p072I6.AbstractC0659p;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0649f;
import p072I6.InterfaceC0650g;
import p072I6.InterfaceC0669z;
import p145S5.C1426d;
import p145S5.C1444v;
import p220c6.AbstractC3026b;
import p302m6.AbstractC6406h;
import p302m6.C6405g;

/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* JADX INFO: renamed from: G */
    public static final Companion f25509G = new Companion(null);

    /* JADX INFO: renamed from: H */
    public static final String f25510H = "journal";

    /* JADX INFO: renamed from: I */
    public static final String f25511I = "journal.tmp";

    /* JADX INFO: renamed from: J */
    public static final String f25512J = "journal.bkp";

    /* JADX INFO: renamed from: K */
    public static final String f25513K = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: L */
    public static final String f25514L = "1";

    /* JADX INFO: renamed from: M */
    public static final long f25515M = -1;

    /* JADX INFO: renamed from: N */
    public static final C6405g f25516N = new C6405g("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: O */
    public static final String f25517O = "CLEAN";

    /* JADX INFO: renamed from: P */
    public static final String f25518P = "DIRTY";

    /* JADX INFO: renamed from: Q */
    public static final String f25519Q = "REMOVE";

    /* JADX INFO: renamed from: R */
    public static final String f25520R = "READ";

    /* JADX INFO: renamed from: A */
    private boolean f25521A;

    /* JADX INFO: renamed from: B */
    private boolean f25522B;

    /* JADX INFO: renamed from: C */
    private boolean f25523C;

    /* JADX INFO: renamed from: D */
    private long f25524D;

    /* JADX INFO: renamed from: E */
    private final TaskQueue f25525E;

    /* JADX INFO: renamed from: F */
    private final DiskLruCache$cleanupTask$1 f25526F;

    /* JADX INFO: renamed from: a */
    private final FileSystem f25527a;

    /* JADX INFO: renamed from: b */
    private final File f25528b;

    /* JADX INFO: renamed from: c */
    private final int f25529c;

    /* JADX INFO: renamed from: d */
    private final int f25530d;

    /* JADX INFO: renamed from: e */
    private long f25531e;

    /* JADX INFO: renamed from: f */
    private final File f25532f;

    /* JADX INFO: renamed from: r */
    private final File f25533r;

    /* JADX INFO: renamed from: s */
    private final File f25534s;

    /* JADX INFO: renamed from: t */
    private long f25535t;

    /* JADX INFO: renamed from: u */
    private InterfaceC0649f f25536u;

    /* JADX INFO: renamed from: v */
    private final LinkedHashMap f25537v;

    /* JADX INFO: renamed from: w */
    private int f25538w;

    /* JADX INFO: renamed from: x */
    private boolean f25539x;

    /* JADX INFO: renamed from: y */
    private boolean f25540y;

    /* JADX INFO: renamed from: z */
    private boolean f25541z;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public final class Editor {

        /* JADX INFO: renamed from: a */
        private final Entry f25542a;

        /* JADX INFO: renamed from: b */
        private final boolean[] f25543b;

        /* JADX INFO: renamed from: c */
        private boolean f25544c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ DiskLruCache f25545d;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            AbstractC6118n.m27187e(entry, "entry");
            this.f25545d = diskLruCache;
            this.f25542a = entry;
            this.f25543b = entry.m28849g() ? null : new boolean[diskLruCache.m28825U0()];
        }

        /* JADX INFO: renamed from: a */
        public final void m28834a() {
            DiskLruCache diskLruCache = this.f25545d;
            synchronized (diskLruCache) {
                try {
                    if (this.f25544c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC6118n.m27183a(this.f25542a.m28844b(), this)) {
                        diskLruCache.m28831o0(this, false);
                    }
                    this.f25544c = true;
                    C1444v c1444v = C1444v.f4971a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m28835b() {
            DiskLruCache diskLruCache = this.f25545d;
            synchronized (diskLruCache) {
                try {
                    if (this.f25544c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (AbstractC6118n.m27183a(this.f25542a.m28844b(), this)) {
                        diskLruCache.m28831o0(this, true);
                    }
                    this.f25544c = true;
                    C1444v c1444v = C1444v.f4971a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m28836c() {
            if (AbstractC6118n.m27183a(this.f25542a.m28844b(), this)) {
                if (this.f25545d.f25540y) {
                    this.f25545d.m28831o0(this, false);
                } else {
                    this.f25542a.m28857q(true);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final Entry m28837d() {
            return this.f25542a;
        }

        /* JADX INFO: renamed from: e */
        public final boolean[] m28838e() {
            return this.f25543b;
        }

        /* JADX INFO: renamed from: f */
        public final InterfaceC0669z m28839f(int i7) {
            DiskLruCache diskLruCache = this.f25545d;
            synchronized (diskLruCache) {
                if (this.f25544c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!AbstractC6118n.m27183a(this.f25542a.m28844b(), this)) {
                    return AbstractC0659p.m3130b();
                }
                if (!this.f25542a.m28849g()) {
                    boolean[] zArr = this.f25543b;
                    AbstractC6118n.m27184b(zArr);
                    zArr[i7] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.m28824T0().mo29336b((File) this.f25542a.m28845c().get(i7)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                } catch (FileNotFoundException unused) {
                    return AbstractC0659p.m3130b();
                }
            }
        }
    }

    public final class Entry {

        /* JADX INFO: renamed from: a */
        private final String f25548a;

        /* JADX INFO: renamed from: b */
        private final long[] f25549b;

        /* JADX INFO: renamed from: c */
        private final List f25550c;

        /* JADX INFO: renamed from: d */
        private final List f25551d;

        /* JADX INFO: renamed from: e */
        private boolean f25552e;

        /* JADX INFO: renamed from: f */
        private boolean f25553f;

        /* JADX INFO: renamed from: g */
        private Editor f25554g;

        /* JADX INFO: renamed from: h */
        private int f25555h;

        /* JADX INFO: renamed from: i */
        private long f25556i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ DiskLruCache f25557j;

        public Entry(DiskLruCache diskLruCache, String key) {
            AbstractC6118n.m27187e(key, "key");
            this.f25557j = diskLruCache;
            this.f25548a = key;
            this.f25549b = new long[diskLruCache.m28825U0()];
            this.f25550c = new ArrayList();
            this.f25551d = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            int length = sb.length();
            int iM28825U0 = diskLruCache.m28825U0();
            for (int i7 = 0; i7 < iM28825U0; i7++) {
                sb.append(i7);
                this.f25550c.add(new File(this.f25557j.m28823S0(), sb.toString()));
                sb.append(".tmp");
                this.f25551d.add(new File(this.f25557j.m28823S0(), sb.toString()));
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: j */
        private final Void m28841j(List list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        /* JADX INFO: renamed from: k */
        private final InterfaceC0640B m28842k(int i7) {
            final InterfaceC0640B interfaceC0640BMo29335a = this.f25557j.m28824T0().mo29335a((File) this.f25550c.get(i7));
            if (this.f25557j.f25540y) {
                return interfaceC0640BMo29335a;
            }
            this.f25555h++;
            final DiskLruCache diskLruCache = this.f25557j;
            return new AbstractC0654k(interfaceC0640BMo29335a) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1

                /* JADX INFO: renamed from: b */
                private boolean f25558b;

                @Override // p072I6.AbstractC0654k, p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (this.f25558b) {
                        return;
                    }
                    this.f25558b = true;
                    DiskLruCache diskLruCache2 = diskLruCache;
                    DiskLruCache.Entry entry = this;
                    synchronized (diskLruCache2) {
                        try {
                            entry.m28854n(entry.m28848f() - 1);
                            if (entry.m28848f() == 0 && entry.m28851i()) {
                                diskLruCache2.m28829d1(entry);
                            }
                            C1444v c1444v = C1444v.f4971a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
        }

        /* JADX INFO: renamed from: a */
        public final List m28843a() {
            return this.f25550c;
        }

        /* JADX INFO: renamed from: b */
        public final Editor m28844b() {
            return this.f25554g;
        }

        /* JADX INFO: renamed from: c */
        public final List m28845c() {
            return this.f25551d;
        }

        /* JADX INFO: renamed from: d */
        public final String m28846d() {
            return this.f25548a;
        }

        /* JADX INFO: renamed from: e */
        public final long[] m28847e() {
            return this.f25549b;
        }

        /* JADX INFO: renamed from: f */
        public final int m28848f() {
            return this.f25555h;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m28849g() {
            return this.f25552e;
        }

        /* JADX INFO: renamed from: h */
        public final long m28850h() {
            return this.f25556i;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m28851i() {
            return this.f25553f;
        }

        /* JADX INFO: renamed from: l */
        public final void m28852l(Editor editor) {
            this.f25554g = editor;
        }

        /* JADX INFO: renamed from: m */
        public final void m28853m(List strings) throws IOException {
            AbstractC6118n.m27187e(strings, "strings");
            if (strings.size() != this.f25557j.m28825U0()) {
                m28841j(strings);
                throw new C1426d();
            }
            try {
                int size = strings.size();
                for (int i7 = 0; i7 < size; i7++) {
                    this.f25549b[i7] = Long.parseLong((String) strings.get(i7));
                }
            } catch (NumberFormatException unused) {
                m28841j(strings);
                throw new C1426d();
            }
        }

        /* JADX INFO: renamed from: n */
        public final void m28854n(int i7) {
            this.f25555h = i7;
        }

        /* JADX INFO: renamed from: o */
        public final void m28855o(boolean z7) {
            this.f25552e = z7;
        }

        /* JADX INFO: renamed from: p */
        public final void m28856p(long j7) {
            this.f25556i = j7;
        }

        /* JADX INFO: renamed from: q */
        public final void m28857q(boolean z7) {
            this.f25553f = z7;
        }

        /* JADX INFO: renamed from: r */
        public final Snapshot m28858r() {
            DiskLruCache diskLruCache = this.f25557j;
            if (Util.f25484h && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            }
            if (!this.f25552e) {
                return null;
            }
            if (!this.f25557j.f25540y && (this.f25554g != null || this.f25553f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f25549b.clone();
            try {
                int iM28825U0 = this.f25557j.m28825U0();
                for (int i7 = 0; i7 < iM28825U0; i7++) {
                    arrayList.add(m28842k(i7));
                }
                return new Snapshot(this.f25557j, this.f25548a, this.f25556i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.m28773m((InterfaceC0640B) it.next());
                }
                try {
                    this.f25557j.m28829d1(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: s */
        public final void m28859s(InterfaceC0649f writer) {
            AbstractC6118n.m27187e(writer, "writer");
            for (long j7 : this.f25549b) {
                writer.mo3010F(32).mo3012I0(j7);
            }
        }
    }

    public final class Snapshot implements Closeable {

        /* JADX INFO: renamed from: a */
        private final String f25561a;

        /* JADX INFO: renamed from: b */
        private final long f25562b;

        /* JADX INFO: renamed from: c */
        private final List f25563c;

        /* JADX INFO: renamed from: d */
        private final long[] f25564d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ DiskLruCache f25565e;

        public Snapshot(DiskLruCache diskLruCache, String key, long j7, List sources, long[] lengths) {
            AbstractC6118n.m27187e(key, "key");
            AbstractC6118n.m27187e(sources, "sources");
            AbstractC6118n.m27187e(lengths, "lengths");
            this.f25565e = diskLruCache;
            this.f25561a = key;
            this.f25562b = j7;
            this.f25563c = sources;
            this.f25564d = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f25563c.iterator();
            while (it.hasNext()) {
                Util.m28773m((InterfaceC0640B) it.next());
            }
        }

        /* JADX INFO: renamed from: d */
        public final Editor m28860d() {
            return this.f25565e.m28833w0(this.f25561a, this.f25562b);
        }

        /* JADX INFO: renamed from: m */
        public final InterfaceC0640B m28861m(int i7) {
            return (InterfaceC0640B) this.f25563c.get(i7);
        }

        /* JADX INFO: renamed from: n */
        public final String m28862n() {
            return this.f25561a;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ Editor m28805K0(DiskLruCache diskLruCache, String str, long j7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = f25515M;
        }
        return diskLruCache.m28833w0(str, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public final boolean m28807W0() {
        int i7 = this.f25538w;
        return i7 >= 2000 && i7 >= this.f25537v.size();
    }

    /* JADX INFO: renamed from: X0 */
    private final InterfaceC0649f m28808X0() {
        return AbstractC0659p.m3131c(new FaultHidingSink(this.f25527a.mo29341g(this.f25532f), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m28809Y0() {
        this.f25527a.mo29340f(this.f25533r);
        Iterator it = this.f25537v.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC6118n.m27186d(next, "i.next()");
            Entry entry = (Entry) next;
            int i7 = 0;
            if (entry.m28844b() == null) {
                int i8 = this.f25530d;
                while (i7 < i8) {
                    this.f25535t += entry.m28847e()[i7];
                    i7++;
                }
            } else {
                entry.m28852l(null);
                int i9 = this.f25530d;
                while (i7 < i9) {
                    this.f25527a.mo29340f((File) entry.m28843a().get(i7));
                    this.f25527a.mo29340f((File) entry.m28845c().get(i7));
                    i7++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m28810Z0() throws IOException {
        InterfaceC0650g interfaceC0650gM3132d = AbstractC0659p.m3132d(this.f25527a.mo29335a(this.f25532f));
        try {
            String strMo3056n0 = interfaceC0650gM3132d.mo3056n0();
            String strMo3056n1 = interfaceC0650gM3132d.mo3056n0();
            String strMo3056n2 = interfaceC0650gM3132d.mo3056n0();
            String strMo3056n3 = interfaceC0650gM3132d.mo3056n0();
            String strMo3056n4 = interfaceC0650gM3132d.mo3056n0();
            if (!AbstractC6118n.m27183a(f25513K, strMo3056n0) || !AbstractC6118n.m27183a(f25514L, strMo3056n1) || !AbstractC6118n.m27183a(String.valueOf(this.f25529c), strMo3056n2) || !AbstractC6118n.m27183a(String.valueOf(this.f25530d), strMo3056n3) || strMo3056n4.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo3056n0 + ", " + strMo3056n1 + ", " + strMo3056n3 + ", " + strMo3056n4 + ']');
            }
            int i7 = 0;
            while (true) {
                try {
                    m28811a1(interfaceC0650gM3132d.mo3056n0());
                    i7++;
                } catch (EOFException unused) {
                    this.f25538w = i7 - this.f25537v.size();
                    if (interfaceC0650gM3132d.mo3009E()) {
                        this.f25536u = m28808X0();
                    } else {
                        m28827b1();
                    }
                    C1444v c1444v = C1444v.f4971a;
                    AbstractC3026b.m14999a(interfaceC0650gM3132d, null);
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(interfaceC0650gM3132d, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    private final void m28811a1(String str) throws IOException {
        String strSubstring;
        int iZ = AbstractC6406h.m27601Z(str, ' ', 0, false, 6, null);
        if (iZ == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i7 = iZ + 1;
        int iZ2 = AbstractC6406h.m27601Z(str, ' ', i7, false, 4, null);
        if (iZ2 == -1) {
            strSubstring = str.substring(i7);
            AbstractC6118n.m27186d(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f25519Q;
            if (iZ == str2.length() && AbstractC6406h.m27557K(str, str2, false, 2, null)) {
                this.f25537v.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i7, iZ2);
            AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = (Entry) this.f25537v.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.f25537v.put(strSubstring, entry);
        }
        if (iZ2 != -1) {
            String str3 = f25517O;
            if (iZ == str3.length() && AbstractC6406h.m27557K(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iZ2 + 1);
                AbstractC6118n.m27186d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listF0 = AbstractC6406h.m27573F0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                entry.m28855o(true);
                entry.m28852l(null);
                entry.m28853m(listF0);
                return;
            }
        }
        if (iZ2 == -1) {
            String str4 = f25518P;
            if (iZ == str4.length() && AbstractC6406h.m27557K(str, str4, false, 2, null)) {
                entry.m28852l(new Editor(this, entry));
                return;
            }
        }
        if (iZ2 == -1) {
            String str5 = f25520R;
            if (iZ == str5.length() && AbstractC6406h.m27557K(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: renamed from: e1 */
    private final boolean m28814e1() {
        for (Entry toEvict : this.f25537v.values()) {
            if (!toEvict.m28851i()) {
                AbstractC6118n.m27186d(toEvict, "toEvict");
                m28829d1(toEvict);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g1 */
    private final void m28815g1(String str) {
        if (f25516N.m27529a(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX INFO: renamed from: l0 */
    private final synchronized void m28817l0() {
        if (this.f25521A) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final synchronized Snapshot m28821Q0(String key) {
        AbstractC6118n.m27187e(key, "key");
        m28826V0();
        m28817l0();
        m28815g1(key);
        Entry entry = (Entry) this.f25537v.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotM28858r = entry.m28858r();
        if (snapshotM28858r == null) {
            return null;
        }
        this.f25538w++;
        InterfaceC0649f interfaceC0649f = this.f25536u;
        AbstractC6118n.m27184b(interfaceC0649f);
        interfaceC0649f.mo3031X(f25520R).mo3010F(32).mo3031X(key).mo3010F(10);
        if (m28807W0()) {
            TaskQueue.m28893j(this.f25525E, this.f25526F, 0L, 2, null);
        }
        return snapshotM28858r;
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m28822R0() {
        return this.f25521A;
    }

    /* JADX INFO: renamed from: S0 */
    public final File m28823S0() {
        return this.f25528b;
    }

    /* JADX INFO: renamed from: T0 */
    public final FileSystem m28824T0() {
        return this.f25527a;
    }

    /* JADX INFO: renamed from: U0 */
    public final int m28825U0() {
        return this.f25530d;
    }

    /* JADX INFO: renamed from: V0 */
    public final synchronized void m28826V0() {
        try {
            if (Util.f25484h && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f25541z) {
                return;
            }
            if (this.f25527a.mo29338d(this.f25534s)) {
                if (this.f25527a.mo29338d(this.f25532f)) {
                    this.f25527a.mo29340f(this.f25534s);
                } else {
                    this.f25527a.mo29339e(this.f25534s, this.f25532f);
                }
            }
            this.f25540y = Util.m28737F(this.f25527a, this.f25534s);
            if (this.f25527a.mo29338d(this.f25532f)) {
                try {
                    m28810Z0();
                    m28809Y0();
                    this.f25541z = true;
                    return;
                } catch (IOException e7) {
                    Platform.f26006a.m29391g().m29381k("DiskLruCache " + this.f25528b + " is corrupt: " + e7.getMessage() + ", removing", 5, e7);
                    try {
                        m28832p0();
                        this.f25521A = false;
                        m28827b1();
                        this.f25541z = true;
                    } catch (Throwable th) {
                        this.f25521A = false;
                        throw th;
                    }
                }
            }
            m28827b1();
            this.f25541z = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final synchronized void m28827b1() {
        try {
            InterfaceC0649f interfaceC0649f = this.f25536u;
            if (interfaceC0649f != null) {
                interfaceC0649f.close();
            }
            InterfaceC0649f interfaceC0649fM3131c = AbstractC0659p.m3131c(this.f25527a.mo29336b(this.f25533r));
            try {
                interfaceC0649fM3131c.mo3031X(f25513K).mo3010F(10);
                interfaceC0649fM3131c.mo3031X(f25514L).mo3010F(10);
                interfaceC0649fM3131c.mo3012I0(this.f25529c).mo3010F(10);
                interfaceC0649fM3131c.mo3012I0(this.f25530d).mo3010F(10);
                interfaceC0649fM3131c.mo3010F(10);
                for (Entry entry : this.f25537v.values()) {
                    if (entry.m28844b() != null) {
                        interfaceC0649fM3131c.mo3031X(f25518P).mo3010F(32);
                        interfaceC0649fM3131c.mo3031X(entry.m28846d());
                        interfaceC0649fM3131c.mo3010F(10);
                    } else {
                        interfaceC0649fM3131c.mo3031X(f25517O).mo3010F(32);
                        interfaceC0649fM3131c.mo3031X(entry.m28846d());
                        entry.m28859s(interfaceC0649fM3131c);
                        interfaceC0649fM3131c.mo3010F(10);
                    }
                }
                C1444v c1444v = C1444v.f4971a;
                AbstractC3026b.m14999a(interfaceC0649fM3131c, null);
                if (this.f25527a.mo29338d(this.f25532f)) {
                    this.f25527a.mo29339e(this.f25532f, this.f25534s);
                }
                this.f25527a.mo29339e(this.f25533r, this.f25532f);
                this.f25527a.mo29340f(this.f25534s);
                this.f25536u = m28808X0();
                this.f25539x = false;
                this.f25523C = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3026b.m14999a(interfaceC0649fM3131c, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final synchronized boolean m28828c1(String key) {
        AbstractC6118n.m27187e(key, "key");
        m28826V0();
        m28817l0();
        m28815g1(key);
        Entry entry = (Entry) this.f25537v.get(key);
        if (entry == null) {
            return false;
        }
        boolean zM28829d1 = m28829d1(entry);
        if (zM28829d1 && this.f25535t <= this.f25531e) {
            this.f25522B = false;
        }
        return zM28829d1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor editorM28844b;
        try {
            if (this.f25541z && !this.f25521A) {
                Collection collectionValues = this.f25537v.values();
                AbstractC6118n.m27186d(collectionValues, "lruEntries.values");
                for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                    if (entry.m28844b() != null && (editorM28844b = entry.m28844b()) != null) {
                        editorM28844b.m28836c();
                    }
                }
                m28830f1();
                InterfaceC0649f interfaceC0649f = this.f25536u;
                AbstractC6118n.m27184b(interfaceC0649f);
                interfaceC0649f.close();
                this.f25536u = null;
                this.f25521A = true;
                return;
            }
            this.f25521A = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m28829d1(Entry entry) {
        InterfaceC0649f interfaceC0649f;
        AbstractC6118n.m27187e(entry, "entry");
        if (!this.f25540y) {
            if (entry.m28848f() > 0 && (interfaceC0649f = this.f25536u) != null) {
                interfaceC0649f.mo3031X(f25518P);
                interfaceC0649f.mo3010F(32);
                interfaceC0649f.mo3031X(entry.m28846d());
                interfaceC0649f.mo3010F(10);
                interfaceC0649f.flush();
            }
            if (entry.m28848f() > 0 || entry.m28844b() != null) {
                entry.m28857q(true);
                return true;
            }
        }
        Editor editorM28844b = entry.m28844b();
        if (editorM28844b != null) {
            editorM28844b.m28836c();
        }
        int i7 = this.f25530d;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f25527a.mo29340f((File) entry.m28843a().get(i8));
            this.f25535t -= entry.m28847e()[i8];
            entry.m28847e()[i8] = 0;
        }
        this.f25538w++;
        InterfaceC0649f interfaceC0649f2 = this.f25536u;
        if (interfaceC0649f2 != null) {
            interfaceC0649f2.mo3031X(f25519Q);
            interfaceC0649f2.mo3010F(32);
            interfaceC0649f2.mo3031X(entry.m28846d());
            interfaceC0649f2.mo3010F(10);
        }
        this.f25537v.remove(entry.m28846d());
        if (m28807W0()) {
            TaskQueue.m28893j(this.f25525E, this.f25526F, 0L, 2, null);
        }
        return true;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m28830f1() {
        while (this.f25535t > this.f25531e) {
            if (!m28814e1()) {
                return;
            }
        }
        this.f25522B = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f25541z) {
            m28817l0();
            m28830f1();
            InterfaceC0649f interfaceC0649f = this.f25536u;
            AbstractC6118n.m27184b(interfaceC0649f);
            interfaceC0649f.flush();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final synchronized void m28831o0(Editor editor, boolean z7) {
        AbstractC6118n.m27187e(editor, "editor");
        Entry entryM28837d = editor.m28837d();
        if (!AbstractC6118n.m27183a(entryM28837d.m28844b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z7 && !entryM28837d.m28849g()) {
            int i7 = this.f25530d;
            for (int i8 = 0; i8 < i7; i8++) {
                boolean[] zArrM28838e = editor.m28838e();
                AbstractC6118n.m27184b(zArrM28838e);
                if (!zArrM28838e[i8]) {
                    editor.m28834a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                }
                if (!this.f25527a.mo29338d((File) entryM28837d.m28845c().get(i8))) {
                    editor.m28834a();
                    return;
                }
            }
        }
        int i9 = this.f25530d;
        for (int i10 = 0; i10 < i9; i10++) {
            File file = (File) entryM28837d.m28845c().get(i10);
            if (!z7 || entryM28837d.m28851i()) {
                this.f25527a.mo29340f(file);
            } else if (this.f25527a.mo29338d(file)) {
                File file2 = (File) entryM28837d.m28843a().get(i10);
                this.f25527a.mo29339e(file, file2);
                long j7 = entryM28837d.m28847e()[i10];
                long jMo29342h = this.f25527a.mo29342h(file2);
                entryM28837d.m28847e()[i10] = jMo29342h;
                this.f25535t = (this.f25535t - j7) + jMo29342h;
            }
        }
        entryM28837d.m28852l(null);
        if (entryM28837d.m28851i()) {
            m28829d1(entryM28837d);
            return;
        }
        this.f25538w++;
        InterfaceC0649f interfaceC0649f = this.f25536u;
        AbstractC6118n.m27184b(interfaceC0649f);
        if (entryM28837d.m28849g() || z7) {
            entryM28837d.m28855o(true);
            interfaceC0649f.mo3031X(f25517O).mo3010F(32);
            interfaceC0649f.mo3031X(entryM28837d.m28846d());
            entryM28837d.m28859s(interfaceC0649f);
            interfaceC0649f.mo3010F(10);
            if (z7) {
                long j8 = this.f25524D;
                this.f25524D = 1 + j8;
                entryM28837d.m28856p(j8);
            }
        } else {
            this.f25537v.remove(entryM28837d.m28846d());
            interfaceC0649f.mo3031X(f25519Q).mo3010F(32);
            interfaceC0649f.mo3031X(entryM28837d.m28846d());
            interfaceC0649f.mo3010F(10);
        }
        interfaceC0649f.flush();
        if (this.f25535t > this.f25531e || m28807W0()) {
            TaskQueue.m28893j(this.f25525E, this.f25526F, 0L, 2, null);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m28832p0() {
        close();
        this.f25527a.mo29337c(this.f25528b);
    }

    /* JADX INFO: renamed from: w0 */
    public final synchronized Editor m28833w0(String key, long j7) {
        AbstractC6118n.m27187e(key, "key");
        m28826V0();
        m28817l0();
        m28815g1(key);
        Entry entry = (Entry) this.f25537v.get(key);
        if (j7 != f25515M && (entry == null || entry.m28850h() != j7)) {
            return null;
        }
        if ((entry != null ? entry.m28844b() : null) != null) {
            return null;
        }
        if (entry != null && entry.m28848f() != 0) {
            return null;
        }
        if (!this.f25522B && !this.f25523C) {
            InterfaceC0649f interfaceC0649f = this.f25536u;
            AbstractC6118n.m27184b(interfaceC0649f);
            interfaceC0649f.mo3031X(f25518P).mo3010F(32).mo3031X(key).mo3010F(10);
            interfaceC0649f.flush();
            if (this.f25539x) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.f25537v.put(key, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.m28852l(editor);
            return editor;
        }
        TaskQueue.m28893j(this.f25525E, this.f25526F, 0L, 2, null);
        return null;
    }
}
