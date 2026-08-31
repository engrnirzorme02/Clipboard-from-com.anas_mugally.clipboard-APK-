package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzcg;
import com.google.android.gms.internal.measurement.zzch;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.V5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4153V5 extends AbstractC4197b6 {

    /* JADX INFO: renamed from: d */
    private final AlarmManager f15455d;

    /* JADX INFO: renamed from: e */
    private AbstractC4366x f15456e;

    /* JADX INFO: renamed from: f */
    private Integer f15457f;

    protected C4153V5(C4317q6 c4317q6) {
        super(c4317q6);
        this.f15455d = (AlarmManager) this.f15066a.mo18424e().getSystemService("alarm");
    }

    /* JADX INFO: renamed from: o */
    private final AbstractC4366x m18646o() {
        if (this.f15456e == null) {
            this.f15456e = new C4146U5(this, this.f15465b.m18921g0());
        }
        return this.f15456e;
    }

    /* JADX INFO: renamed from: p */
    private final void m18647p() {
        JobScheduler jobScheduler = (JobScheduler) this.f15066a.mo18424e().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m18648q());
        }
    }

    /* JADX INFO: renamed from: q */
    private final int m18648q() {
        if (this.f15457f == null) {
            this.f15457f = Integer.valueOf("measurement".concat(String.valueOf(this.f15066a.mo18424e().getPackageName())).hashCode());
        }
        return this.f15457f.intValue();
    }

    /* JADX INFO: renamed from: r */
    private final PendingIntent m18649r() {
        Context contextMo18424e = this.f15066a.mo18424e();
        return PendingIntent.getBroadcast(contextMo18424e, 0, new Intent().setClassName(contextMo18424e, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcg.zza);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4197b6
    /* JADX INFO: renamed from: l */
    protected final boolean mo18457l() {
        AlarmManager alarmManager = this.f15455d;
        if (alarmManager != null) {
            alarmManager.cancel(m18649r());
        }
        m18647p();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m18650m(long j7) {
        m18696j();
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.mo18423c();
        Context contextMo18424e = c4164x2.mo18424e();
        if (!C4389z6.m19361j0(contextMo18424e)) {
            c4164x2.mo18421a().m18858v().m18834a("Receiver not registered/enabled");
        }
        if (!C4389z6.m19355E(contextMo18424e, false)) {
            c4164x2.mo18421a().m18858v().m18834a("Service not registered/enabled");
        }
        m18651n();
        c4164x2.mo18421a().m18859w().m18835b("Scheduling upload, millis", Long.valueOf(j7));
        c4164x2.mo18425f().mo18161c();
        c4164x2.m18686w();
        if (j7 < Math.max(0L, ((Long) AbstractC4209d2.f15620M.m18706b(null)).longValue()) && !m18646o().m19250c()) {
            m18646o().m19249b(j7);
        }
        c4164x2.mo18423c();
        Context contextMo18424e2 = c4164x2.mo18424e();
        ComponentName componentName = new ComponentName(contextMo18424e2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iM18648q = m18648q();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        zzch.zza(contextMo18424e2, new JobInfo.Builder(iM18648q, componentName).setMinimumLatency(j7).setOverrideDeadline(j7 + j7).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    /* JADX INFO: renamed from: n */
    public final void m18651n() {
        m18696j();
        this.f15066a.mo18421a().m18859w().m18834a("Unscheduling upload");
        AlarmManager alarmManager = this.f15455d;
        if (alarmManager != null) {
            alarmManager.cancel(m18649r());
        }
        m18646o().m19251d();
        m18647p();
    }
}
