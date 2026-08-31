package p252g4;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p175X0.AbstractC1926d;
import p228d4.C5235g;
import p260h4.C5653i;
import p268i4.C5707c;
import p268i4.C5710f;
import p268i4.C5718n;
import p276j4.AbstractC5868F;
import p300m4.C6344e;
import p300m4.C6346g;
import p308n4.C6497b;
import p316o4.InterfaceC6589j;
import p326p4.InterfaceC6756d;

/* JADX INFO: renamed from: g4.Z */
/* JADX INFO: loaded from: classes.dex */
public class C5487Z {

    /* JADX INFO: renamed from: a */
    private final C5515y f20814a;

    /* JADX INFO: renamed from: b */
    private final C6344e f20815b;

    /* JADX INFO: renamed from: c */
    private final C6497b f20816c;

    /* JADX INFO: renamed from: d */
    private final C5710f f20817d;

    /* JADX INFO: renamed from: e */
    private final C5718n f20818e;

    /* JADX INFO: renamed from: f */
    private final C5470H f20819f;

    /* JADX INFO: renamed from: g */
    private final C5653i f20820g;

    C5487Z(C5515y c5515y, C6344e c6344e, C6497b c6497b, C5710f c5710f, C5718n c5718n, C5470H c5470h, C5653i c5653i) {
        this.f20814a = c5515y;
        this.f20815b = c6344e;
        this.f20816c = c6497b;
        this.f20817d = c5710f;
        this.f20818e = c5718n;
        this.f20819f = c5470h;
        this.f20820g = c5653i;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m24732a(C5487Z c5487z, AbstractC5868F.e.d dVar, C5707c c5707c, boolean z7) {
        c5487z.getClass();
        C5235g.m24179f().m24180b("disk worker: log non-fatal event to persistence");
        c5487z.f20815b.m27325w(dVar, c5707c.m25273b(), z7);
    }

    /* JADX INFO: renamed from: d */
    private AbstractC5868F.e.d m24735d(AbstractC5868F.e.d dVar, C5710f c5710f, C5718n c5718n) {
        return m24736e(dVar, c5710f, c5718n, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: e */
    private AbstractC5868F.e.d m24736e(AbstractC5868F.e.d dVar, C5710f c5710f, C5718n c5718n, Map map) {
        AbstractC5868F.e.d.b bVarMo26458h = dVar.mo26458h();
        String strM25288c = c5710f.m25288c();
        if (strM25288c != null) {
            bVarMo26458h.mo26553d(AbstractC5868F.e.d.AbstractC7710d.m26571a().mo26574b(strM25288c).mo26573a());
        } else {
            C5235g.m24179f().m24186i("No log data to include with this event.");
        }
        List listM24744o = m24744o(c5718n.m25355e(map));
        List listM24744o2 = m24744o(c5718n.m25356f());
        if (!listM24744o.isEmpty() || !listM24744o2.isEmpty()) {
            bVarMo26458h.mo26551b(dVar.mo26452b().mo26467i().mo26472e(listM24744o).mo26474g(listM24744o2).mo26468a());
        }
        return bVarMo26458h.mo26550a();
    }

    /* JADX INFO: renamed from: f */
    private AbstractC5868F.e.d m24737f(AbstractC5868F.e.d dVar, Map map) {
        return m24738g(m24736e(dVar, this.f20817d, this.f20818e, map), this.f20818e);
    }

    /* JADX INFO: renamed from: g */
    private AbstractC5868F.e.d m24738g(AbstractC5868F.e.d dVar, C5718n c5718n) {
        List listM25357g = c5718n.m25357g();
        if (listM25357g.isEmpty()) {
            return dVar;
        }
        AbstractC5868F.e.d.b bVarMo26458h = dVar.mo26458h();
        bVarMo26458h.mo26554e(AbstractC5868F.e.d.f.m26591a().mo26594b(listM25357g).mo26593a());
        return bVarMo26458h.mo26550a();
    }

    /* JADX INFO: renamed from: h */
    private static AbstractC5868F.a m24739h(ApplicationExitInfo applicationExitInfo) {
        String strM24740i = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strM24740i = m24740i(traceInputStream);
            }
        } catch (IOException e7) {
            C5235g.m24179f().m24188k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e7);
        }
        return AbstractC5868F.a.m26325a().mo26345c(applicationExitInfo.getImportance()).mo26347e(applicationExitInfo.getProcessName()).mo26349g(applicationExitInfo.getReason()).mo26351i(applicationExitInfo.getTimestamp()).mo26346d(applicationExitInfo.getPid()).mo26348f(applicationExitInfo.getPss()).mo26350h(applicationExitInfo.getRss()).mo26352j(strM24740i).mo26343a();
    }

    /* JADX INFO: renamed from: i */
    public static String m24740i(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i7 = bufferedInputStream.read(bArr);
                    if (i7 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            bufferedInputStream.close();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: j */
    public static C5487Z m24741j(Context context, C5470H c5470h, C6346g c6346g, C5488a c5488a, C5710f c5710f, C5718n c5718n, InterfaceC6756d interfaceC6756d, InterfaceC6589j interfaceC6589j, C5475M c5475m, C5503m c5503m, C5653i c5653i) {
        return new C5487Z(new C5515y(context, c5470h, c5488a, interfaceC6756d, interfaceC6589j), new C6344e(c6346g, interfaceC6589j, c5503m), C6497b.m27656b(context, interfaceC6589j, c5475m), c5710f, c5718n, c5470h, c5653i);
    }

    /* JADX INFO: renamed from: k */
    private AbstractC5516z m24742k(AbstractC5516z abstractC5516z) {
        if (abstractC5516z.mo24759b().mo26310h() != null && abstractC5516z.mo24759b().mo26309g() != null) {
            return abstractC5516z;
        }
        C5469G c5469gM24706d = this.f20819f.m24706d(true);
        return AbstractC5516z.m24924a(abstractC5516z.mo24759b().m26322t(c5469gM24706d.m24697b()).m26321s(c5469gM24706d.m24696a()), abstractC5516z.mo24761d(), abstractC5516z.mo24760c());
    }

    /* JADX INFO: renamed from: n */
    private ApplicationExitInfo m24743n(String str, List list) {
        long jM27322q = this.f20815b.m27322q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoM7970a = AbstractC1926d.m7970a(it.next());
            if (applicationExitInfoM7970a.getTimestamp() < jM27322q) {
                return null;
            }
            if (applicationExitInfoM7970a.getReason() == 6) {
                return applicationExitInfoM7970a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    private static List m24744o(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(AbstractC5868F.c.m26366a().mo26370b((String) entry.getKey()).mo26371c((String) entry.getValue()).mo26369a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: g4.W
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((AbstractC5868F.c) obj).mo26367b().compareTo(((AbstractC5868F.c) obj2).mo26367b());
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public boolean m24745s(Task task) {
        if (!task.isSuccessful()) {
            C5235g.m24179f().m24189l("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        AbstractC5516z abstractC5516z = (AbstractC5516z) task.getResult();
        C5235g.m24179f().m24180b("Crashlytics report successfully enqueued to DataTransport: " + abstractC5516z.mo24761d());
        File fileMo24760c = abstractC5516z.mo24760c();
        if (fileMo24760c.delete()) {
            C5235g.m24179f().m24180b("Deleted report file: " + fileMo24760c.getPath());
            return true;
        }
        C5235g.m24179f().m24188k("Crashlytics could not delete report file: " + fileMo24760c.getPath());
        return true;
    }

    /* JADX INFO: renamed from: t */
    private void m24746t(Throwable th, Thread thread, String str, final C5707c c5707c, boolean z7) {
        final boolean zEquals = str.equals("crash");
        final AbstractC5868F.e.d dVarM24737f = m24737f(this.f20814a.m24922d(th, thread, str, c5707c.m25274c(), 4, 8, z7), c5707c.m25272a());
        if (z7) {
            this.f20815b.m27325w(dVarM24737f, c5707c.m25273b(), zEquals);
        } else {
            this.f20820g.f21641b.m25132e(new Runnable() { // from class: g4.X
                @Override // java.lang.Runnable
                public final void run() {
                    C5487Z.m24732a(this.f20809a, dVarM24737f, c5707c, zEquals);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l */
    public void m24747l(String str, List list, AbstractC5868F.a aVar) {
        C5235g.m24179f().m24180b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5868F.d.b bVarMo24695c = ((InterfaceC5473K) it.next()).mo24695c();
            if (bVarMo24695c != null) {
                arrayList.add(bVarMo24695c);
            }
        }
        this.f20815b.m27320l(str, AbstractC5868F.d.m26372a().mo26376b(Collections.unmodifiableList(arrayList)).mo26375a(), aVar);
    }

    /* JADX INFO: renamed from: m */
    public void m24748m(long j7, String str) {
        this.f20815b.m27319k(str, j7);
    }

    /* JADX INFO: renamed from: p */
    public boolean m24749p() {
        return this.f20815b.m27323r();
    }

    /* JADX INFO: renamed from: q */
    public SortedSet m24750q() {
        return this.f20815b.m27321p();
    }

    /* JADX INFO: renamed from: r */
    public void m24751r(String str, long j7) {
        this.f20815b.m27326x(this.f20814a.m24923e(str, j7));
    }

    /* JADX INFO: renamed from: u */
    public void m24752u(Throwable th, Thread thread, String str, long j7) {
        C5235g.m24179f().m24186i("Persisting fatal event for session " + str);
        m24746t(th, thread, "crash", new C5707c(str, j7), true);
    }

    /* JADX INFO: renamed from: v */
    public void m24753v(String str, List list, C5710f c5710f, C5718n c5718n) {
        ApplicationExitInfo applicationExitInfoM24743n = m24743n(str, list);
        if (applicationExitInfoM24743n == null) {
            C5235g.m24179f().m24186i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC5868F.e.d dVarM24921c = this.f20814a.m24921c(m24739h(applicationExitInfoM24743n));
        C5235g.m24179f().m24180b("Persisting anr for session " + str);
        this.f20815b.m27325w(m24738g(m24735d(dVarM24921c, c5710f, c5718n), c5718n), str, true);
    }

    /* JADX INFO: renamed from: w */
    public void m24754w() {
        this.f20815b.m27318i();
    }

    /* JADX INFO: renamed from: x */
    public Task m24755x(Executor executor) {
        return m24756y(executor, null);
    }

    /* JADX INFO: renamed from: y */
    public Task m24756y(Executor executor, String str) {
        List<AbstractC5516z> listM27324u = this.f20815b.m27324u();
        ArrayList arrayList = new ArrayList();
        for (AbstractC5516z abstractC5516z : listM27324u) {
            if (str == null || str.equals(abstractC5516z.mo24761d())) {
                arrayList.add(this.f20816c.m27658c(m24742k(abstractC5516z), str != null).continueWith(executor, new Continuation() { // from class: g4.Y
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(this.f20813a.m24745s(task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
