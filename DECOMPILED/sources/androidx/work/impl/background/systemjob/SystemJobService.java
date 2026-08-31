package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p112O0.AbstractC1097j;
import p119P0.C1182i;
import p119P0.InterfaceC1175b;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1175b {

    /* JADX INFO: renamed from: c */
    private static final String f11952c = AbstractC1097j.m4846f("SystemJobService");

    /* JADX INFO: renamed from: a */
    private C1182i f11953a;

    /* JADX INFO: renamed from: b */
    private final Map f11954b = new HashMap();

    /* JADX INFO: renamed from: a */
    private static String m14580a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p119P0.InterfaceC1175b
    /* JADX INFO: renamed from: d */
    public void mo5123d(String str, boolean z7) {
        JobParameters jobParameters;
        AbstractC1097j.m4844c().mo4847a(f11952c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f11954b) {
            jobParameters = (JobParameters) this.f11954b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z7);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C1182i c1182iM5164k = C1182i.m5164k(getApplicationContext());
            this.f11953a = c1182iM5164k;
            c1182iM5164k.m5171m().m5129c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            AbstractC1097j.m4844c().mo4851h(f11952c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C1182i c1182i = this.f11953a;
        if (c1182i != null) {
            c1182i.m5171m().m5133i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f11953a == null) {
            AbstractC1097j.m4844c().mo4847a(f11952c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strM14580a = m14580a(jobParameters);
        if (TextUtils.isEmpty(strM14580a)) {
            AbstractC1097j.m4844c().mo4848b(f11952c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f11954b) {
            try {
                if (this.f11954b.containsKey(strM14580a)) {
                    AbstractC1097j.m4844c().mo4847a(f11952c, String.format("Job is already being executed by SystemJobService: %s", strM14580a), new Throwable[0]);
                    return false;
                }
                AbstractC1097j.m4844c().mo4847a(f11952c, String.format("onStartJob for %s", strM14580a), new Throwable[0]);
                this.f11954b.put(strM14580a, jobParameters);
                int i7 = Build.VERSION.SDK_INT;
                WorkerParameters.C2894a c2894a = new WorkerParameters.C2894a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    c2894a.f11857b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    c2894a.f11856a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i7 >= 28) {
                    c2894a.f11858c = jobParameters.getNetwork();
                }
                this.f11953a.m5179v(strM14580a, c2894a);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f11953a == null) {
            AbstractC1097j.m4844c().mo4847a(f11952c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strM14580a = m14580a(jobParameters);
        if (TextUtils.isEmpty(strM14580a)) {
            AbstractC1097j.m4844c().mo4848b(f11952c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        AbstractC1097j.m4844c().mo4847a(f11952c, String.format("onStopJob for %s", strM14580a), new Throwable[0]);
        synchronized (this.f11954b) {
            this.f11954b.remove(strM14580a);
        }
        this.f11953a.m5181x(strM14580a);
        return !this.f11953a.m5171m().m5130f(strM14580a);
    }
}
