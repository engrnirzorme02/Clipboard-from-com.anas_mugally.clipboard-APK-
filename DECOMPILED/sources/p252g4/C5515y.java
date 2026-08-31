package p252g4;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p228d4.C5238j;
import p276j4.AbstractC5868F;
import p316o4.InterfaceC6589j;
import p326p4.C6757e;
import p326p4.InterfaceC6756d;

/* JADX INFO: renamed from: g4.y */
/* JADX INFO: loaded from: classes.dex */
public class C5515y {

    /* JADX INFO: renamed from: g */
    private static final Map f20937g;

    /* JADX INFO: renamed from: h */
    static final String f20938h;

    /* JADX INFO: renamed from: a */
    private final Context f20939a;

    /* JADX INFO: renamed from: b */
    private final C5470H f20940b;

    /* JADX INFO: renamed from: c */
    private final C5488a f20941c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6756d f20942d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC6589j f20943e;

    /* JADX INFO: renamed from: f */
    private final C5238j f20944f = C5238j.f19969a;

    static {
        HashMap map = new HashMap();
        f20937g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f20938h = String.format(Locale.US, "Crashlytics Android SDK/%s", "20.0.2");
    }

    public C5515y(Context context, C5470H c5470h, C5488a c5488a, InterfaceC6756d interfaceC6756d, InterfaceC6589j interfaceC6589j) {
        this.f20939a = context;
        this.f20940b = c5470h;
        this.f20941c = c5488a;
        this.f20942d = interfaceC6756d;
        this.f20943e = interfaceC6589j;
    }

    /* JADX INFO: renamed from: A */
    private AbstractC5868F.e.d.a.c m24897A(AbstractC5868F.a aVar) {
        return this.f20944f.m24193a(aVar.mo26329e(), aVar.mo26328d(), aVar.mo26327c());
    }

    /* JADX INFO: renamed from: a */
    private AbstractC5868F.a m24898a(AbstractC5868F.a aVar) {
        List listUnmodifiableList;
        if (!this.f20943e.mo27919b().f24824b.f24833c || this.f20941c.f20823c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C5496f c5496f : this.f20941c.f20823c) {
                arrayList.add(AbstractC5868F.a.AbstractC7695a.m26335a().mo26342d(c5496f.m24772c()).mo26340b(c5496f.m24770a()).mo26341c(c5496f.m24771b()).mo26339a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return AbstractC5868F.a.m26325a().mo26345c(aVar.mo26327c()).mo26347e(aVar.mo26329e()).mo26349g(aVar.mo26331g()).mo26351i(aVar.mo26333i()).mo26346d(aVar.mo26328d()).mo26348f(aVar.mo26330f()).mo26350h(aVar.mo26332h()).mo26352j(aVar.mo26334j()).mo26344b(listUnmodifiableList).mo26343a();
    }

    /* JADX INFO: renamed from: b */
    private AbstractC5868F.b m24899b() {
        return AbstractC5868F.m26304b().mo26364l("20.0.2").mo26360h(this.f20941c.f20821a).mo26361i(this.f20940b.mo24705a().mo24714c()).mo26359g(this.f20940b.mo24705a().mo24716e()).mo26358f(this.f20940b.mo24705a().mo24715d()).mo26356d(this.f20941c.f20826f).mo26357e(this.f20941c.f20827g).mo26363k(4);
    }

    /* JADX INFO: renamed from: f */
    private static long m24900f(long j7) {
        if (j7 > 0) {
            return j7;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: g */
    private static int m24901g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f20937g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: h */
    private AbstractC5868F.e.d.a.b.AbstractC7699a m24902h() {
        return AbstractC5868F.e.d.a.b.AbstractC7699a.m26482a().mo26489b(0L).mo26491d(0L).mo26490c(this.f20941c.f20825e).mo26492e(this.f20941c.f20822b).mo26488a();
    }

    /* JADX INFO: renamed from: i */
    private List m24903i() {
        return Collections.singletonList(m24902h());
    }

    /* JADX INFO: renamed from: j */
    private AbstractC5868F.e.d.a m24904j(int i7, AbstractC5868F.a aVar) {
        return AbstractC5868F.e.d.a.m26459a().mo26470c(Boolean.valueOf(aVar.mo26327c() != 100)).mo26471d(m24897A(aVar)).mo26475h(i7).mo26473f(m24909o(aVar)).mo26468a();
    }

    /* JADX INFO: renamed from: k */
    private AbstractC5868F.e.d.a m24905k(int i7, C6757e c6757e, Thread thread, int i8, int i9, boolean z7) {
        Boolean boolValueOf;
        AbstractC5868F.e.d.a.c cVarM24196e = this.f20944f.m24196e(this.f20939a);
        if (cVarM24196e.mo26541b() > 0) {
            boolValueOf = Boolean.valueOf(cVarM24196e.mo26541b() != 100);
        } else {
            boolValueOf = null;
        }
        return AbstractC5868F.e.d.a.m26459a().mo26470c(boolValueOf).mo26471d(cVarM24196e).mo26469b(this.f20944f.m24195d(this.f20939a)).mo26475h(i7).mo26473f(m24910p(c6757e, thread, i8, i9, z7)).mo26468a();
    }

    /* JADX INFO: renamed from: l */
    private AbstractC5868F.e.d.c m24906l(int i7) {
        C5495e c5495eM24765a = C5495e.m24765a(this.f20939a);
        Float fM24768b = c5495eM24765a.m24768b();
        Double dValueOf = fM24768b != null ? Double.valueOf(fM24768b.doubleValue()) : null;
        int iM24769c = c5495eM24765a.m24769c();
        boolean zM24796n = AbstractC5499i.m24796n(this.f20939a);
        return AbstractC5868F.e.d.c.m26557a().mo26565b(dValueOf).mo26566c(iM24769c).mo26569f(zM24796n).mo26568e(i7).mo26570g(m24900f(AbstractC5499i.m24784b(this.f20939a) - AbstractC5499i.m24783a(this.f20939a))).mo26567d(AbstractC5499i.m24785c(Environment.getDataDirectory().getPath())).mo26564a();
    }

    /* JADX INFO: renamed from: m */
    private AbstractC5868F.e.d.a.b.c m24907m(C6757e c6757e, int i7, int i8) {
        return m24908n(c6757e, i7, i8, 0);
    }

    /* JADX INFO: renamed from: n */
    private AbstractC5868F.e.d.a.b.c m24908n(C6757e c6757e, int i7, int i8, int i9) {
        String str = c6757e.f27136b;
        String str2 = c6757e.f27135a;
        StackTraceElement[] stackTraceElementArr = c6757e.f27137c;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C6757e c6757e2 = c6757e.f27138d;
        if (i9 >= i8) {
            C6757e c6757e3 = c6757e2;
            while (c6757e3 != null) {
                c6757e3 = c6757e3.f27138d;
                i10++;
            }
        }
        AbstractC5868F.e.d.a.b.c.AbstractC7702a abstractC7702aMo26509d = AbstractC5868F.e.d.a.b.c.m26500a().mo26511f(str).mo26510e(str2).mo26508c(m24912r(stackTraceElementArr, i7)).mo26509d(i10);
        if (c6757e2 != null && i10 == 0) {
            abstractC7702aMo26509d.mo26507b(m24908n(c6757e2, i7, i8, i9 + 1));
        }
        return abstractC7702aMo26509d.mo26506a();
    }

    /* JADX INFO: renamed from: o */
    private AbstractC5868F.e.d.a.b m24909o(AbstractC5868F.a aVar) {
        return AbstractC5868F.e.d.a.b.m26476a().mo26495b(aVar).mo26498e(m24917w()).mo26496c(m24903i()).mo26494a();
    }

    /* JADX INFO: renamed from: p */
    private AbstractC5868F.e.d.a.b m24910p(C6757e c6757e, Thread thread, int i7, int i8, boolean z7) {
        return AbstractC5868F.e.d.a.b.m26476a().mo26499f(m24920z(c6757e, thread, i7, z7)).mo26497d(m24907m(c6757e, i7, i8)).mo26498e(m24917w()).mo26496c(m24903i()).mo26494a();
    }

    /* JADX INFO: renamed from: q */
    private AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b m24911q(StackTraceElement stackTraceElement, AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.AbstractC7708a abstractC7708a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC7708a.mo26538e(jMax).mo26539f(str).mo26535b(fileName).mo26537d(lineNumber).mo26534a();
    }

    /* JADX INFO: renamed from: r */
    private List m24912r(StackTraceElement[] stackTraceElementArr, int i7) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(m24911q(stackTraceElement, AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7707b.m26528a().mo26536c(i7)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: s */
    private AbstractC5868F.e.a m24913s() {
        return AbstractC5868F.e.a.m26402a().mo26414e(this.f20940b.m24707f()).mo26416g(this.f20941c.f20826f).mo26413d(this.f20941c.f20827g).mo26415f(this.f20940b.mo24705a().mo24714c()).mo26411b(this.f20941c.f20828h.m24174d()).mo26412c(this.f20941c.f20828h.m24175e()).mo26410a();
    }

    /* JADX INFO: renamed from: t */
    private AbstractC5868F.e m24914t(String str, long j7) {
        return AbstractC5868F.e.m26384a().mo26429m(j7).mo26426j(str).mo26424h(f20938h).mo26418b(m24913s()).mo26428l(m24916v()).mo26421e(m24915u()).mo26425i(3).mo26417a();
    }

    /* JADX INFO: renamed from: u */
    private AbstractC5868F.e.c m24915u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iM24901g = m24901g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jM24784b = AbstractC5499i.m24784b(this.f20939a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zM24806x = AbstractC5499i.m24806x();
        int iM24794l = AbstractC5499i.m24794l();
        String str = Build.MANUFACTURER;
        return AbstractC5868F.e.c.m26431a().mo26442b(iM24901g).mo26446f(Build.MODEL).mo26443c(iAvailableProcessors).mo26448h(jM24784b).mo26444d(blockCount).mo26449i(zM24806x).mo26450j(iM24794l).mo26445e(str).mo26447g(Build.PRODUCT).mo26441a();
    }

    /* JADX INFO: renamed from: v */
    private AbstractC5868F.e.AbstractC7712e m24916v() {
        return AbstractC5868F.e.AbstractC7712e.m26595a().mo26603d(3).mo26604e(Build.VERSION.RELEASE).mo26601b(Build.VERSION.CODENAME).mo26602c(AbstractC5499i.m24807y()).mo26600a();
    }

    /* JADX INFO: renamed from: w */
    private AbstractC5868F.e.d.a.b.AbstractC7703d m24917w() {
        return AbstractC5868F.e.d.a.b.AbstractC7703d.m26512a().mo26519d("0").mo26518c("0").mo26517b(0L).mo26516a();
    }

    /* JADX INFO: renamed from: x */
    private AbstractC5868F.e.d.a.b.AbstractC7705e m24918x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m24919y(thread, stackTraceElementArr, 0);
    }

    /* JADX INFO: renamed from: y */
    private AbstractC5868F.e.d.a.b.AbstractC7705e m24919y(Thread thread, StackTraceElement[] stackTraceElementArr, int i7) {
        return AbstractC5868F.e.d.a.b.AbstractC7705e.m26520a().mo26527d(thread.getName()).mo26526c(i7).mo26525b(m24912r(stackTraceElementArr, i7)).mo26524a();
    }

    /* JADX INFO: renamed from: z */
    private List m24920z(C6757e c6757e, Thread thread, int i7, boolean z7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m24919y(thread, c6757e.f27137c, i7));
        if (z7) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(m24918x(key, this.f20942d.mo29540a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC5868F.e.d m24921c(AbstractC5868F.a aVar) {
        int i7 = this.f20939a.getResources().getConfiguration().orientation;
        return AbstractC5868F.e.d.m26451a().mo26556g("anr").mo26555f(aVar.mo26333i()).mo26551b(m24904j(i7, m24898a(aVar))).mo26552c(m24906l(i7)).mo26550a();
    }

    /* JADX INFO: renamed from: d */
    public AbstractC5868F.e.d m24922d(Throwable th, Thread thread, String str, long j7, int i7, int i8, boolean z7) {
        int i9 = this.f20939a.getResources().getConfiguration().orientation;
        return AbstractC5868F.e.d.m26451a().mo26556g(str).mo26555f(j7).mo26551b(m24905k(i9, C6757e.m29543a(th, this.f20942d), thread, i7, i8, z7)).mo26552c(m24906l(i9)).mo26550a();
    }

    /* JADX INFO: renamed from: e */
    public AbstractC5868F m24923e(String str, long j7) {
        return m24899b().mo26365m(m24914t(str, j7)).mo26353a();
    }
}
