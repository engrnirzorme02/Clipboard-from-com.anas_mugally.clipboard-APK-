package p252g4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p228d4.C5235g;
import p228d4.InterfaceC5229a;
import p228d4.InterfaceC5236h;
import p236e4.InterfaceC5344a;
import p260h4.AbstractC5646b;
import p260h4.C5653i;
import p268i4.C5710f;
import p268i4.C5718n;
import p276j4.AbstractC5868F;
import p276j4.AbstractC5869G;
import p300m4.C6346g;
import p309n5.C6501a;
import p316o4.C6583d;
import p316o4.InterfaceC6589j;

/* JADX INFO: renamed from: g4.p */
/* JADX INFO: loaded from: classes.dex */
class C5506p {

    /* JADX INFO: renamed from: t */
    static final FilenameFilter f20870t = new FilenameFilter() { // from class: g4.o
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };

    /* JADX INFO: renamed from: u */
    private static final Charset f20871u = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    private final Context f20872a;

    /* JADX INFO: renamed from: b */
    private final C5465C f20873b;

    /* JADX INFO: renamed from: c */
    private final C5514x f20874c;

    /* JADX INFO: renamed from: d */
    private final C5718n f20875d;

    /* JADX INFO: renamed from: e */
    private final C5653i f20876e;

    /* JADX INFO: renamed from: f */
    private final C5470H f20877f;

    /* JADX INFO: renamed from: g */
    private final C6346g f20878g;

    /* JADX INFO: renamed from: h */
    private final C5488a f20879h;

    /* JADX INFO: renamed from: i */
    private final C5710f f20880i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC5229a f20881j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC5344a f20882k;

    /* JADX INFO: renamed from: l */
    private final C5503m f20883l;

    /* JADX INFO: renamed from: m */
    private final C5487Z f20884m;

    /* JADX INFO: renamed from: n */
    private C5463A f20885n;

    /* JADX INFO: renamed from: o */
    private InterfaceC6589j f20886o = null;

    /* JADX INFO: renamed from: p */
    final TaskCompletionSource f20887p = new TaskCompletionSource();

    /* JADX INFO: renamed from: q */
    final TaskCompletionSource f20888q = new TaskCompletionSource();

    /* JADX INFO: renamed from: r */
    final TaskCompletionSource f20889r = new TaskCompletionSource();

    /* JADX INFO: renamed from: s */
    final AtomicBoolean f20890s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g4.p$a */
    class a implements C5463A.a {
        a() {
        }

        @Override // p252g4.C5463A.a
        /* JADX INFO: renamed from: a */
        public void mo24672a(InterfaceC6589j interfaceC6589j, Thread thread, Throwable th) throws Throwable {
            C5506p.this.m24858G(interfaceC6589j, thread, th);
        }
    }

    /* JADX INFO: renamed from: g4.p$b */
    class b implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f20892a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Throwable f20893b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Thread f20894c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC6589j f20895d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean f20896e;

        /* JADX INFO: renamed from: g4.p$b$a */
        class a implements SuccessContinuation {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f20898a;

            a(String str) {
                this.f20898a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task then(C6583d c6583d) {
                if (c6583d != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{C5506p.this.m24829L(), C5506p.this.f20884m.m24756y(C5506p.this.f20876e.f21640a, b.this.f20896e ? this.f20898a : null)});
                }
                C5235g.m24179f().m24188k("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }
        }

        b(long j7, Throwable th, Thread thread, InterfaceC6589j interfaceC6589j, boolean z7) {
            this.f20892a = j7;
            this.f20893b = th;
            this.f20894c = thread;
            this.f20895d = interfaceC6589j;
            this.f20896e = z7;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() {
            long jM24827E = C5506p.m24827E(this.f20892a);
            String strM24823A = C5506p.this.m24823A();
            if (strM24823A == null) {
                C5235g.m24179f().m24182d("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            C5506p.this.f20874c.m24894a();
            C5506p.this.f20884m.m24752u(this.f20893b, this.f20894c, strM24823A, jM24827E);
            C5506p.this.m24854v(this.f20892a);
            C5506p.this.m24868s(this.f20895d);
            C5506p.this.m24853u(new C5498h().m24780c(), Boolean.valueOf(this.f20896e));
            return !C5506p.this.f20873b.m24680d() ? Tasks.forResult(null) : this.f20895d.mo27918a().onSuccessTask(C5506p.this.f20876e.f21640a, new a(strM24823A));
        }
    }

    /* JADX INFO: renamed from: g4.p$c */
    class c implements SuccessContinuation {
        c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task then(Void r7) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: g4.p$d */
    class d implements SuccessContinuation {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Task f20901a;

        /* JADX INFO: renamed from: g4.p$d$a */
        class a implements SuccessContinuation {
            a() {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task then(C6583d c6583d) {
                if (c6583d == null) {
                    C5235g.m24179f().m24188k("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
                C5506p.this.m24829L();
                C5506p.this.f20884m.m24755x(C5506p.this.f20876e.f21640a);
                C5506p.this.f20889r.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        d(Task task) {
            this.f20901a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task then(Boolean bool) {
            if (bool.booleanValue()) {
                C5235g.m24179f().m24180b("Sending cached crash reports...");
                C5506p.this.f20873b.m24679c(bool.booleanValue());
                return this.f20901a.onSuccessTask(C5506p.this.f20876e.f21640a, new a());
            }
            C5235g.m24179f().m24186i("Deleting cached crash reports...");
            C5506p.m24851q(C5506p.this.m24861J());
            C5506p.this.f20884m.m24754w();
            C5506p.this.f20889r.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    /* JADX INFO: renamed from: g4.p$e */
    class e implements Callable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f20904a;

        e(long j7) {
            this.f20904a = j7;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f20904a);
            C5506p.this.f20882k.mo14980a("_ae", bundle);
            return null;
        }
    }

    C5506p(Context context, C5470H c5470h, C5465C c5465c, C6346g c6346g, C5514x c5514x, C5488a c5488a, C5718n c5718n, C5710f c5710f, C5487Z c5487z, InterfaceC5229a interfaceC5229a, InterfaceC5344a interfaceC5344a, C5503m c5503m, C5653i c5653i) {
        this.f20872a = context;
        this.f20877f = c5470h;
        this.f20873b = c5465c;
        this.f20878g = c6346g;
        this.f20874c = c5514x;
        this.f20879h = c5488a;
        this.f20875d = c5718n;
        this.f20880i = c5710f;
        this.f20881j = interfaceC5229a;
        this.f20882k = interfaceC5344a;
        this.f20883l = c5503m;
        this.f20884m = c5487z;
        this.f20876e = c5653i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public String m24823A() {
        SortedSet sortedSetM24750q = this.f20884m.m24750q();
        if (sortedSetM24750q.isEmpty()) {
            return null;
        }
        return (String) sortedSetM24750q.first();
    }

    /* JADX INFO: renamed from: B */
    private static long m24824B() {
        return m24827E(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: C */
    static List m24825C(InterfaceC5236h interfaceC5236h, String str, C6346g c6346g, byte[] bArr) {
        File fileM27349q = c6346g.m27349q(str, "user-data");
        File fileM27349q2 = c6346g.m27349q(str, "keys");
        File fileM27349q3 = c6346g.m27349q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5497g("logs_file", "logs", bArr));
        arrayList.add(new C5468F("crash_meta_file", "metadata", interfaceC5236h.mo24169g()));
        arrayList.add(new C5468F("session_meta_file", "session", interfaceC5236h.mo24168f()));
        arrayList.add(new C5468F("app_meta_file", "app", interfaceC5236h.mo24163a()));
        arrayList.add(new C5468F("device_meta_file", "device", interfaceC5236h.mo24165c()));
        arrayList.add(new C5468F("os_meta_file", "os", interfaceC5236h.mo24164b()));
        arrayList.add(m24831N(interfaceC5236h));
        arrayList.add(new C5468F("user_meta_file", "user", fileM27349q));
        arrayList.add(new C5468F("keys_file", "keys", fileM27349q2));
        arrayList.add(new C5468F("rollouts_file", "rollouts", fileM27349q3));
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    private InputStream m24826D(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        C5235g.m24179f().m24188k("Couldn't get Class Loader");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static long m24827E(long j7) {
        return j7 / 1000;
    }

    /* JADX INFO: renamed from: K */
    private Task m24828K(long j7) {
        if (m24856z()) {
            C5235g.m24179f().m24188k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        C5235g.m24179f().m24180b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new e(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public Task m24829L() {
        ArrayList arrayList = new ArrayList();
        for (File file : m24861J()) {
            try {
                arrayList.add(m24828K(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C5235g.m24179f().m24188k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX INFO: renamed from: M */
    private static boolean m24830M(String str, File file, AbstractC5868F.a aVar) {
        if (file == null || !file.exists()) {
            C5235g.m24179f().m24188k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            C5235g.m24179f().m24184g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    /* JADX INFO: renamed from: N */
    private static InterfaceC5473K m24831N(InterfaceC5236h interfaceC5236h) {
        File fileMo24167e = interfaceC5236h.mo24167e();
        return (fileMo24167e == null || !fileMo24167e.exists()) ? new C5497g("minidump_file", "minidump", new byte[]{0}) : new C5468F("minidump_file", "minidump", fileMo24167e);
    }

    /* JADX INFO: renamed from: P */
    private static byte[] m24832P(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i7 = inputStream.read(bArr);
                if (i7 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i7);
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: T */
    private Task m24833T() {
        if (this.f20873b.m24680d()) {
            C5235g.m24179f().m24180b("Automatic data collection is enabled. Allowing upload.");
            this.f20887p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        C5235g.m24179f().m24180b("Automatic data collection is disabled.");
        C5235g.m24179f().m24186i("Notifying that unsent reports are available.");
        this.f20887p.trySetResult(Boolean.TRUE);
        Task taskOnSuccessTask = this.f20873b.m24681h().onSuccessTask(new c());
        C5235g.m24179f().m24180b("Waiting for send/deleteUnsentReports to be called.");
        return AbstractC5646b.m25128b(taskOnSuccessTask, this.f20888q.getTask());
    }

    /* JADX INFO: renamed from: U */
    private void m24834U(String str) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            C5235g.m24179f().m24186i("ANR feature enabled, but device is API " + i7);
            return;
        }
        List historicalProcessExitReasons = ((ActivityManager) this.f20872a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f20884m.m24753v(str, historicalProcessExitReasons, new C5710f(this.f20878g, str), C5718n.m25353i(str, this.f20878g, this.f20876e));
        } else {
            C5235g.m24179f().m24186i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    /* JADX INFO: renamed from: n */
    private static AbstractC5869G.a m24848n(C5470H c5470h, C5488a c5488a) {
        return AbstractC5869G.a.m26607b(c5470h.m24707f(), c5488a.f20826f, c5488a.f20827g, c5470h.mo24705a().mo24714c(), EnumC5466D.m24684d(c5488a.f20824d).m24685h(), c5488a.f20828h);
    }

    /* JADX INFO: renamed from: o */
    private static AbstractC5869G.b m24849o(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC5869G.b.m26608c(AbstractC5499i.m24793k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC5499i.m24784b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), AbstractC5499i.m24806x(), AbstractC5499i.m24794l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* JADX INFO: renamed from: p */
    private static AbstractC5869G.c m24850p() {
        return AbstractC5869G.c.m26609a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC5499i.m24807y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static void m24851q(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    private void m24852t(boolean z7, InterfaceC6589j interfaceC6589j, boolean z8) {
        String str;
        C5653i.m25136c();
        ArrayList arrayList = new ArrayList(this.f20884m.m24750q());
        if (arrayList.size() <= z7) {
            C5235g.m24179f().m24186i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z7 ? 1 : 0);
        if (z8 && interfaceC6589j.mo27919b().f24824b.f24832b) {
            m24834U(str2);
        } else {
            C5235g.m24179f().m24186i("ANR feature disabled.");
        }
        if (z8 && this.f20881j.mo24159c(str2)) {
            m24855x(str2);
        }
        if (z7 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f20883l.m24822e(null);
            str = null;
        }
        this.f20884m.m24748m(m24824B(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m24853u(String str, Boolean bool) {
        long jM24824B = m24824B();
        C5235g.m24179f().m24180b("Opening a new session with ID " + str);
        this.f20881j.mo24160d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C5513w.m24885k()), jM24824B, AbstractC5869G.m26606b(m24848n(this.f20877f, this.f20879h), m24850p(), m24849o(this.f20872a)));
        if (bool.booleanValue() && str != null) {
            this.f20875d.m25360l(str);
        }
        this.f20880i.m25289e(str);
        this.f20883l.m24822e(str);
        this.f20884m.m24751r(str, jM24824B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m24854v(long j7) {
        try {
            if (this.f20878g.m27340g(".ae" + j7).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e7) {
            C5235g.m24179f().m24189l("Could not create app exception marker file.", e7);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m24855x(String str) {
        C5235g.m24179f().m24186i("Finalizing native report for session " + str);
        InterfaceC5236h interfaceC5236hMo24157a = this.f20881j.mo24157a(str);
        File fileMo24167e = interfaceC5236hMo24157a.mo24167e();
        AbstractC5868F.a aVarMo24166d = interfaceC5236hMo24157a.mo24166d();
        if (m24830M(str, fileMo24167e, aVarMo24166d)) {
            C5235g.m24179f().m24188k("No native core present");
            return;
        }
        long jLastModified = fileMo24167e.lastModified();
        C5710f c5710f = new C5710f(this.f20878g, str);
        File fileM27344k = this.f20878g.m27344k(str);
        if (!fileM27344k.isDirectory()) {
            C5235g.m24179f().m24188k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m24854v(jLastModified);
        List listM24825C = m24825C(interfaceC5236hMo24157a, str, this.f20878g, c5710f.m25287b());
        AbstractC5474L.m24720b(fileM27344k, listM24825C);
        C5235g.m24179f().m24180b("CrashlyticsController#finalizePreviousNativeSession");
        this.f20884m.m24747l(str, listM24825C, aVarMo24166d);
        c5710f.m25286a();
    }

    /* JADX INFO: renamed from: z */
    private static boolean m24856z() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: F */
    String m24857F() throws IOException {
        String strM24800r = AbstractC5499i.m24800r(this.f20872a);
        if (strM24800r != null) {
            C5235g.m24179f().m24180b("Read version control info from string resource");
            return Base64.encodeToString(strM24800r.getBytes(f20871u), 0);
        }
        InputStream inputStreamM24826D = m24826D("META-INF/version-control-info.textproto");
        if (inputStreamM24826D == null) {
            if (inputStreamM24826D != null) {
                inputStreamM24826D.close();
            }
            C5235g.m24179f().m24184g("No version control information found");
            return null;
        }
        try {
            C5235g.m24179f().m24180b("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(m24832P(inputStreamM24826D), 0);
            inputStreamM24826D.close();
            return strEncodeToString;
        } catch (Throwable th) {
            try {
                inputStreamM24826D.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: G */
    void m24858G(InterfaceC6589j interfaceC6589j, Thread thread, Throwable th) throws Throwable {
        m24859H(interfaceC6589j, thread, th, false);
    }

    /* JADX INFO: renamed from: H */
    synchronized void m24859H(InterfaceC6589j interfaceC6589j, Thread thread, Throwable th, boolean z7) throws Throwable {
        Throwable th2;
        try {
            try {
                C5235g.m24179f().m24180b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
                if (!z7) {
                    try {
                        C6501a.m27674b();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                Task taskM25133f = this.f20876e.f21640a.m25133f(new b(System.currentTimeMillis(), th, thread, interfaceC6589j, z7));
                if (!z7) {
                    try {
                        AbstractC5493c0.m24763b(taskM25133f);
                    } catch (TimeoutException unused) {
                        C5235g.m24179f().m24182d("Cannot send reports. Timed out while fetching settings.");
                    } catch (Exception e7) {
                        C5235g.m24179f().m24183e("Error handling uncaught exception", e7);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: renamed from: I */
    boolean m24860I() {
        C5463A c5463a = this.f20885n;
        return c5463a != null && c5463a.m24671a();
    }

    /* JADX INFO: renamed from: J */
    List m24861J() {
        return this.f20878g.m27341h(f20870t);
    }

    /* JADX INFO: renamed from: O */
    void m24862O(final String str) {
        this.f20876e.f21640a.m25132e(new Runnable() { // from class: g4.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f20868a.m24853u(str, Boolean.FALSE);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    void m24863Q() {
        try {
            String strM24857F = m24857F();
            if (strM24857F != null) {
                m24864R("com.crashlytics.version-control-info", strM24857F);
                C5235g.m24179f().m24184g("Saved version control info");
            }
        } catch (IOException e7) {
            C5235g.m24179f().m24189l("Unable to save version control info", e7);
        }
    }

    /* JADX INFO: renamed from: R */
    void m24864R(String str, String str2) {
        try {
            this.f20875d.m25359k(str, str2);
        } catch (IllegalArgumentException e7) {
            Context context = this.f20872a;
            if (context != null && AbstractC5499i.m24804v(context)) {
                throw e7;
            }
            C5235g.m24179f().m24182d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: renamed from: S */
    void m24865S(Task task) {
        if (this.f20884m.m24749p()) {
            C5235g.m24179f().m24186i("Crash reports are available to be sent.");
            m24833T().onSuccessTask(this.f20876e.f21640a, new d(task));
        } else {
            C5235g.m24179f().m24186i("No crash reports are available to be sent.");
            this.f20887p.trySetResult(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: V */
    public void m24866V(long j7, String str) {
        if (m24860I()) {
            return;
        }
        this.f20880i.m25291g(j7, str);
    }

    /* JADX INFO: renamed from: r */
    boolean m24867r() {
        C5653i.m25136c();
        if (!this.f20874c.m24895c()) {
            String strM24823A = m24823A();
            return strM24823A != null && this.f20881j.mo24159c(strM24823A);
        }
        C5235g.m24179f().m24186i("Found previous crash marker.");
        this.f20874c.m24896d();
        return true;
    }

    /* JADX INFO: renamed from: s */
    void m24868s(InterfaceC6589j interfaceC6589j) {
        m24852t(false, interfaceC6589j, false);
    }

    /* JADX INFO: renamed from: w */
    void m24869w(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC6589j interfaceC6589j) {
        this.f20886o = interfaceC6589j;
        m24862O(str);
        C5463A c5463a = new C5463A(new a(), interfaceC6589j, uncaughtExceptionHandler, this.f20881j);
        this.f20885n = c5463a;
        Thread.setDefaultUncaughtExceptionHandler(c5463a);
    }

    /* JADX INFO: renamed from: y */
    boolean m24870y(InterfaceC6589j interfaceC6589j) {
        C5653i.m25136c();
        if (m24860I()) {
            C5235g.m24179f().m24188k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C5235g.m24179f().m24186i("Finalizing previously open sessions.");
        try {
            m24852t(true, interfaceC6589j, true);
            C5235g.m24179f().m24186i("Closed all previously open sessions.");
            return true;
        } catch (Exception e7) {
            C5235g.m24179f().m24183e("Unable to finalize previously open sessions.", e7);
            return false;
        }
    }
}
