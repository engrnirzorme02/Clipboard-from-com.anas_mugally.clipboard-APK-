package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzin;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.D4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4020D4 extends AbstractC4225f2 {

    /* JADX INFO: renamed from: c */
    private JobScheduler f15163c;

    public C4020D4(C4164X2 c4164x2) {
        super(c4164x2);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4225f2
    /* JADX INFO: renamed from: m */
    protected final boolean mo18463m() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4225f2
    /* JADX INFO: renamed from: n */
    protected final void mo18464n() {
        this.f15163c = (JobScheduler) this.f15066a.mo18424e().getSystemService("jobscheduler");
    }

    /* JADX INFO: renamed from: o */
    public final void m18465o(long j7) {
        m18748j();
        mo18427h();
        JobScheduler jobScheduler = this.f15163c;
        if (jobScheduler != null && jobScheduler.getPendingJob(m18466p()) != null) {
            this.f15066a.mo18421a().m18859w().m18834a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        zzin zzinVarM18467q = m18467q();
        if (zzinVarM18467q != zzin.CLIENT_UPLOAD_ELIGIBLE) {
            this.f15066a.mo18421a().m18859w().m18835b("[sgtm] Not eligible for Scion upload", zzinVarM18467q.name());
            return;
        }
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.mo18421a().m18859w().m18835b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j7));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        c4164x2.mo18421a().m18859w().m18835b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) AbstractC3718s.m18083l(this.f15163c)).schedule(new JobInfo.Builder(m18466p(), new ComponentName(c4164x2.mo18424e(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j7).setOverrideDeadline(j7 + j7).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    /* JADX INFO: renamed from: p */
    final int m18466p() {
        return "measurement-client".concat(String.valueOf(this.f15066a.mo18424e().getPackageName())).hashCode();
    }

    /* JADX INFO: renamed from: q */
    final zzin m18467q() {
        m18748j();
        mo18427h();
        if (this.f15163c == null) {
            return zzin.MISSING_JOB_SCHEDULER;
        }
        C4164X2 c4164x2 = this.f15066a;
        if (!c4164x2.m18686w().m18808P()) {
            return zzin.NOT_ENABLED_IN_MANIFEST;
        }
        C4164X2 c4164x3 = this.f15066a;
        if (c4164x3.m18670L().m18758u() < 119000) {
            return zzin.SDK_TOO_OLD;
        }
        if (C4389z6.m19356F(c4164x2.mo18424e(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return !c4164x3.m18668J().m19245y() ? zzin.NON_PLAY_MODE : zzin.CLIENT_UPLOAD_ELIGIBLE;
        }
        return zzin.MEASUREMENT_SERVICE_NOT_ENABLED;
    }
}
