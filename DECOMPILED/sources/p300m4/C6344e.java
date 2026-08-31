package p300m4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p228d4.C5235g;
import p252g4.AbstractC5516z;
import p252g4.C5503m;
import p268i4.C5718n;
import p276j4.AbstractC5868F;
import p284k4.C6065j;
import p316o4.InterfaceC6589j;

/* JADX INFO: renamed from: m4.e */
/* JADX INFO: loaded from: classes.dex */
public class C6344e {

    /* JADX INFO: renamed from: e */
    private static final Charset f24184e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f */
    private static final int f24185f = 15;

    /* JADX INFO: renamed from: g */
    private static final C6065j f24186g = new C6065j();

    /* JADX INFO: renamed from: h */
    private static final Comparator f24187h = new Comparator() { // from class: m4.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* JADX INFO: renamed from: i */
    private static final FilenameFilter f24188i = new FilenameFilter() { // from class: m4.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f24189a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    private final C6346g f24190b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6589j f24191c;

    /* JADX INFO: renamed from: d */
    private final C5503m f24192d;

    public C6344e(C6346g c6346g, InterfaceC6589j interfaceC6589j, C5503m c5503m) {
        this.f24190b = c6346g;
        this.f24191c = interfaceC6589j;
        this.f24192d = c5503m;
    }

    /* JADX INFO: renamed from: A */
    private void m27296A(String str, long j7) {
        boolean z7;
        List listM27350r = this.f24190b.m27350r(str, f24188i);
        if (listM27350r.isEmpty()) {
            C5235g.m24179f().m24186i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listM27350r);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM27350r.iterator();
        loop0: while (true) {
            z7 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File file = (File) it.next();
                try {
                    arrayList.add(f24186g.m27099j(m27316y(file)));
                    if (z7 || m27313s(file.getName())) {
                        z7 = true;
                    }
                } catch (IOException e7) {
                    C5235g.m24179f().m24189l("Could not add event to report for " + file, e7);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m27297B(this.f24190b.m27349q(str, "report"), arrayList, j7, z7, C5718n.m25354j(str, this.f24190b), this.f24192d.m24821d(str));
        } else {
            C5235g.m24179f().m24188k("Could not parse event files for session " + str);
        }
    }

    /* JADX INFO: renamed from: B */
    private void m27297B(File file, List list, long j7, boolean z7, String str, String str2) {
        try {
            C6065j c6065j = f24186g;
            AbstractC5868F abstractC5868FM26320r = c6065j.m27097L(m27316y(file)).m26324v(j7, z7, str).m26318p(str2).m26320r(list);
            AbstractC5868F.e eVarMo26316n = abstractC5868FM26320r.mo26316n();
            if (eVarMo26316n == null) {
                return;
            }
            C5235g.m24179f().m24180b("appQualitySessionId: " + str2);
            m27299D(z7 ? this.f24190b.m27345l(eVarMo26316n.mo26392i()) : this.f24190b.m27347n(eVarMo26316n.mo26392i()), c6065j.m27098M(abstractC5868FM26320r));
        } catch (IOException e7) {
            C5235g.m24179f().m24189l("Could not synthesize final report file for " + file, e7);
        }
    }

    /* JADX INFO: renamed from: C */
    private int m27298C(String str, int i7) {
        List listM27350r = this.f24190b.m27350r(str, new FilenameFilter() { // from class: m4.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return C6344e.m27314t(file, str2);
            }
        });
        Collections.sort(listM27350r, new Comparator() { // from class: m4.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C6344e.m27315v((File) obj, (File) obj2);
            }
        });
        return m27306f(listM27350r, i7);
    }

    /* JADX INFO: renamed from: D */
    private static void m27299D(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f24184e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: E */
    private static void m27300E(File file, String str, long j7) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f24184e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m27308h(j7));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    private SortedSet m27305e(String str) {
        this.f24190b.m27337d();
        SortedSet sortedSetM27321p = m27321p();
        if (str != null) {
            sortedSetM27321p.remove(str);
        }
        if (sortedSetM27321p.size() > 8) {
            while (sortedSetM27321p.size() > 8) {
                String str2 = (String) sortedSetM27321p.last();
                C5235g.m24179f().m24180b("Removing session over cap: " + str2);
                this.f24190b.m27338e(str2);
                sortedSetM27321p.remove(str2);
            }
        }
        return sortedSetM27321p;
    }

    /* JADX INFO: renamed from: f */
    private static int m27306f(List list, int i7) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i7) {
                break;
            }
            C6346g.m27333u(file);
            size--;
        }
        return size;
    }

    /* JADX INFO: renamed from: g */
    private void m27307g() {
        int i7 = this.f24191c.mo27919b().f24823a.f24835b;
        List listM27311n = m27311n();
        int size = listM27311n.size();
        if (size <= i7) {
            return;
        }
        Iterator it = listM27311n.subList(i7, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX INFO: renamed from: h */
    private static long m27308h(long j7) {
        return j7 * 1000;
    }

    /* JADX INFO: renamed from: j */
    private void m27309j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX INFO: renamed from: m */
    private static String m27310m(int i7, boolean z7) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i7)) + (z7 ? "_" : "");
    }

    /* JADX INFO: renamed from: n */
    private List m27311n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f24190b.m27346m());
        arrayList.addAll(this.f24190b.m27343j());
        Comparator comparator = f24187h;
        Collections.sort(arrayList, comparator);
        List listM27348o = this.f24190b.m27348o();
        Collections.sort(listM27348o, comparator);
        arrayList.addAll(listM27348o);
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private static String m27312o(String str) {
        return str.substring(0, f24185f);
    }

    /* JADX INFO: renamed from: s */
    private static boolean m27313s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static boolean m27314t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static int m27315v(File file, File file2) {
        return m27312o(file.getName()).compareTo(m27312o(file2.getName()));
    }

    /* JADX INFO: renamed from: y */
    private static String m27316y(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i7 = fileInputStream.read(bArr);
                if (i7 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f24184e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i7);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private void m27317z(File file, AbstractC5868F.d dVar, String str, AbstractC5868F.a aVar) {
        String strM24821d = this.f24192d.m24821d(str);
        try {
            C6065j c6065j = f24186g;
            m27299D(this.f24190b.m27342i(str), c6065j.m27098M(c6065j.m27097L(m27316y(file)).m26323u(dVar).m26319q(aVar).m26318p(strM24821d)));
        } catch (IOException e7) {
            C5235g.m24179f().m24189l("Could not synthesize final native report file for " + file, e7);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m27318i() {
        m27309j(this.f24190b.m27348o());
        m27309j(this.f24190b.m27346m());
        m27309j(this.f24190b.m27343j());
    }

    /* JADX INFO: renamed from: k */
    public void m27319k(String str, long j7) {
        for (String str2 : m27305e(str)) {
            C5235g.m24179f().m24186i("Finalizing report for session " + str2);
            m27296A(str2, j7);
            this.f24190b.m27338e(str2);
        }
        m27307g();
    }

    /* JADX INFO: renamed from: l */
    public void m27320l(String str, AbstractC5868F.d dVar, AbstractC5868F.a aVar) {
        File fileM27349q = this.f24190b.m27349q(str, "report");
        C5235g.m24179f().m24180b("Writing native session report for " + str + " to file: " + fileM27349q);
        m27317z(fileM27349q, dVar, str, aVar);
    }

    /* JADX INFO: renamed from: p */
    public SortedSet m27321p() {
        return new TreeSet(this.f24190b.m27339f()).descendingSet();
    }

    /* JADX INFO: renamed from: q */
    public long m27322q(String str) {
        return this.f24190b.m27349q(str, "start-time").lastModified();
    }

    /* JADX INFO: renamed from: r */
    public boolean m27323r() {
        return (this.f24190b.m27348o().isEmpty() && this.f24190b.m27346m().isEmpty() && this.f24190b.m27343j().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public List m27324u() {
        List<File> listM27311n = m27311n();
        ArrayList arrayList = new ArrayList();
        for (File file : listM27311n) {
            try {
                arrayList.add(AbstractC5516z.m24924a(f24186g.m27097L(m27316y(file)), file.getName(), file));
            } catch (IOException e7) {
                C5235g.m24179f().m24189l("Could not load report file " + file + "; deleting", e7);
                file.delete();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public void m27325w(AbstractC5868F.e.d dVar, String str, boolean z7) {
        int i7 = this.f24191c.mo27919b().f24823a.f24834a;
        try {
            m27299D(this.f24190b.m27349q(str, m27310m(this.f24189a.getAndIncrement(), z7)), f24186g.m27100k(dVar));
        } catch (IOException e7) {
            C5235g.m24179f().m24189l("Could not persist event for session " + str, e7);
        }
        m27298C(str, i7);
    }

    /* JADX INFO: renamed from: x */
    public void m27326x(AbstractC5868F abstractC5868F) {
        AbstractC5868F.e eVarMo26316n = abstractC5868F.mo26316n();
        if (eVarMo26316n == null) {
            C5235g.m24179f().m24180b("Could not get session for report");
            return;
        }
        String strMo26392i = eVarMo26316n.mo26392i();
        try {
            m27299D(this.f24190b.m27349q(strMo26392i, "report"), f24186g.m27098M(abstractC5868F));
            m27300E(this.f24190b.m27349q(strMo26392i, "start-time"), "", eVarMo26316n.mo26395l());
        } catch (IOException e7) {
            C5235g.m24179f().m24181c("Could not persist report for session " + strMo26392i, e7);
        }
    }
}
