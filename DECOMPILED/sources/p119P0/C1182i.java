package p119P0;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.C2895a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p112O0.AbstractC1097j;
import p112O0.AbstractC1103p;
import p112O0.AbstractC1107t;
import p112O0.InterfaceC1100m;
import p126Q0.C1246b;
import p133R0.C1306e;
import p175X0.AbstractRunnableC1923a;
import p175X0.C1930h;
import p175X0.RunnableC1934l;
import p175X0.RunnableC1935m;
import p182Y0.C2011b;
import p182Y0.InterfaceC2010a;

/* JADX INFO: renamed from: P0.i */
/* JADX INFO: loaded from: classes.dex */
public class C1182i extends AbstractC1107t {

    /* JADX INFO: renamed from: j */
    private static final String f4171j = AbstractC1097j.m4846f("WorkManagerImpl");

    /* JADX INFO: renamed from: k */
    private static C1182i f4172k = null;

    /* JADX INFO: renamed from: l */
    private static C1182i f4173l = null;

    /* JADX INFO: renamed from: m */
    private static final Object f4174m = new Object();

    /* JADX INFO: renamed from: a */
    private Context f4175a;

    /* JADX INFO: renamed from: b */
    private C2895a f4176b;

    /* JADX INFO: renamed from: c */
    private WorkDatabase f4177c;

    /* JADX INFO: renamed from: d */
    private InterfaceC2010a f4178d;

    /* JADX INFO: renamed from: e */
    private List f4179e;

    /* JADX INFO: renamed from: f */
    private C1177d f4180f;

    /* JADX INFO: renamed from: g */
    private C1930h f4181g;

    /* JADX INFO: renamed from: h */
    private boolean f4182h;

    /* JADX INFO: renamed from: i */
    private BroadcastReceiver.PendingResult f4183i;

    public C1182i(Context context, C2895a c2895a, InterfaceC2010a interfaceC2010a) {
        this(context, c2895a, interfaceC2010a, context.getResources().getBoolean(AbstractC1103p.f3968a));
    }

    /* JADX INFO: renamed from: e */
    public static void m5162e(Context context, C2895a c2895a) {
        synchronized (f4174m) {
            try {
                C1182i c1182i = f4172k;
                if (c1182i != null && f4173l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c1182i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f4173l == null) {
                        f4173l = new C1182i(applicationContext, c2895a, new C2011b(c2895a.m14491l()));
                    }
                    f4172k = f4173l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static C1182i m5163j() {
        synchronized (f4174m) {
            try {
                C1182i c1182i = f4172k;
                if (c1182i != null) {
                    return c1182i;
                }
                return f4173l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static C1182i m5164k(Context context) {
        C1182i c1182iM5163j;
        synchronized (f4174m) {
            try {
                c1182iM5163j = m5163j();
                if (c1182iM5163j == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1182iM5163j;
    }

    /* JADX INFO: renamed from: q */
    private void m5165q(Context context, C2895a c2895a, InterfaceC2010a interfaceC2010a, WorkDatabase workDatabase, List list, C1177d c1177d) {
        Context applicationContext = context.getApplicationContext();
        this.f4175a = applicationContext;
        this.f4176b = c2895a;
        this.f4178d = interfaceC2010a;
        this.f4177c = workDatabase;
        this.f4179e = list;
        this.f4180f = c1177d;
        this.f4181g = new C1930h(workDatabase);
        this.f4182h = false;
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f4178d.mo8371b(new ForceStopRunnable(applicationContext, this));
    }

    @Override // p112O0.AbstractC1107t
    /* JADX INFO: renamed from: a */
    public InterfaceC1100m mo4864a(String str) {
        AbstractRunnableC1923a abstractRunnableC1923aM7957d = AbstractRunnableC1923a.m7957d(str, this);
        this.f4178d.mo8371b(abstractRunnableC1923aM7957d);
        return abstractRunnableC1923aM7957d.m7960e();
    }

    @Override // p112O0.AbstractC1107t
    /* JADX INFO: renamed from: c */
    public InterfaceC1100m mo4866c(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C1180g(this, list).m5146a();
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC1100m m5166f(UUID uuid) {
        AbstractRunnableC1923a abstractRunnableC1923aM7955b = AbstractRunnableC1923a.m7955b(uuid, this);
        this.f4178d.mo8371b(abstractRunnableC1923aM7955b);
        return abstractRunnableC1923aM7955b.m7960e();
    }

    /* JADX INFO: renamed from: g */
    public List m5167g(Context context, C2895a c2895a, InterfaceC2010a interfaceC2010a) {
        return Arrays.asList(AbstractC1179f.m5142a(context, this), new C1246b(context, c2895a, interfaceC2010a, this));
    }

    /* JADX INFO: renamed from: h */
    public Context m5168h() {
        return this.f4175a;
    }

    /* JADX INFO: renamed from: i */
    public C2895a m5169i() {
        return this.f4176b;
    }

    /* JADX INFO: renamed from: l */
    public C1930h m5170l() {
        return this.f4181g;
    }

    /* JADX INFO: renamed from: m */
    public C1177d m5171m() {
        return this.f4180f;
    }

    /* JADX INFO: renamed from: n */
    public List m5172n() {
        return this.f4179e;
    }

    /* JADX INFO: renamed from: o */
    public WorkDatabase m5173o() {
        return this.f4177c;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC2010a m5174p() {
        return this.f4178d;
    }

    /* JADX INFO: renamed from: r */
    public void m5175r() {
        synchronized (f4174m) {
            try {
                this.f4182h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f4183i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f4183i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m5176s() {
        C1306e.m5640b(m5168h());
        m5173o().mo14518K().mo7557u();
        AbstractC1179f.m5143b(m5169i(), m5173o(), m5172n());
    }

    /* JADX INFO: renamed from: t */
    public void m5177t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f4174m) {
            try {
                this.f4183i = pendingResult;
                if (this.f4182h) {
                    pendingResult.finish();
                    this.f4183i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m5178u(String str) {
        m5179v(str, null);
    }

    /* JADX INFO: renamed from: v */
    public void m5179v(String str, WorkerParameters.C2894a c2894a) {
        this.f4178d.mo8371b(new RunnableC1934l(this, str, c2894a));
    }

    /* JADX INFO: renamed from: w */
    public void m5180w(String str) {
        this.f4178d.mo8371b(new RunnableC1935m(this, str, true));
    }

    /* JADX INFO: renamed from: x */
    public void m5181x(String str) {
        this.f4178d.mo8371b(new RunnableC1935m(this, str, false));
    }

    public C1182i(Context context, C2895a c2895a, InterfaceC2010a interfaceC2010a, boolean z7) {
        this(context, c2895a, interfaceC2010a, WorkDatabase.m14509B(context.getApplicationContext(), interfaceC2010a.getBackgroundExecutor(), z7));
    }

    public C1182i(Context context, C2895a c2895a, InterfaceC2010a interfaceC2010a, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        AbstractC1097j.m4845e(new AbstractC1097j.a(c2895a.m14489j()));
        List listM5167g = m5167g(applicationContext, c2895a, interfaceC2010a);
        m5165q(context, c2895a, interfaceC2010a, workDatabase, listM5167g, new C1177d(context, c2895a, interfaceC2010a, workDatabase, listM5167g));
    }
}
