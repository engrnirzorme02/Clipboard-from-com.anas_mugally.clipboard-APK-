package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p216c2.AbstractC3000p;
import p216c2.C3005u;
import p306n2.AbstractC6482a;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i7 = jobParameters.getExtras().getInt("priority");
        int i8 = jobParameters.getExtras().getInt("attemptNumber");
        C3005u.m14973f(getApplicationContext());
        AbstractC3000p.a aVarMo14935d = AbstractC3000p.m14964a().mo14933b(string).mo14935d(AbstractC6482a.m27650b(i7));
        if (string2 != null) {
            aVarMo14935d.mo14934c(Base64.decode(string2, 0));
        }
        C3005u.m14971c().m14974e().m26266m(aVarMo14935d.mo14932a(), i8, new Runnable() { // from class: j2.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f22975a.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
