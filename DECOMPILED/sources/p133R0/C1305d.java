package p133R0;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import p081K.C0709a;
import p112O0.AbstractC1097j;
import p112O0.C1089b;
import p112O0.C1090c;
import p112O0.EnumC1088a;
import p112O0.EnumC1098k;
import p168W0.C1814p;

/* JADX INFO: renamed from: R0.d */
/* JADX INFO: loaded from: classes.dex */
class C1305d {

    /* JADX INFO: renamed from: b */
    private static final String f4590b = AbstractC1097j.m4846f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a */
    private final ComponentName f4591a;

    /* JADX INFO: renamed from: R0.d$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4592a;

        static {
            int[] iArr = new int[EnumC1098k.values().length];
            f4592a = iArr;
            try {
                iArr[EnumC1098k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4592a[EnumC1098k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4592a[EnumC1098k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4592a[EnumC1098k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4592a[EnumC1098k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    C1305d(Context context) {
        this.f4591a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX INFO: renamed from: b */
    private static JobInfo.TriggerContentUri m5636b(C1090c.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.m4833a(), aVar.m4834b() ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    static int m5637c(EnumC1098k enumC1098k) {
        int i7 = a.f4592a[enumC1098k.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 3) {
            return 2;
        }
        if (i7 == 4) {
            return 3;
        }
        if (i7 == 5) {
            return 4;
        }
        AbstractC1097j.m4844c().mo4847a(f4590b, String.format("API version too low. Cannot convert network type value %s", enumC1098k), new Throwable[0]);
        return 1;
    }

    /* JADX INFO: renamed from: d */
    static void m5638d(JobInfo.Builder builder, EnumC1098k enumC1098k) {
        if (Build.VERSION.SDK_INT < 30 || enumC1098k != EnumC1098k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m5637c(enumC1098k));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* JADX INFO: renamed from: a */
    JobInfo m5639a(C1814p c1814p, int i7) {
        C1089b c1089b = c1814p.f5901j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c1814p.f5892a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c1814p.m7535d());
        JobInfo.Builder extras = new JobInfo.Builder(i7, this.f4591a).setRequiresCharging(c1089b.m4817g()).setRequiresDeviceIdle(c1089b.m4818h()).setExtras(persistableBundle);
        m5638d(extras, c1089b.m4812b());
        if (!c1089b.m4818h()) {
            extras.setBackoffCriteria(c1814p.f5904m, c1814p.f5903l == EnumC1088a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(c1814p.m7532a() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!c1814p.f5908q) {
            extras.setImportantWhileForeground(true);
        }
        if (c1089b.m4815e()) {
            Iterator it = c1089b.m4811a().m4831b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(m5636b((C1090c.a) it.next()));
            }
            extras.setTriggerContentUpdateDelay(c1089b.m4813c());
            extras.setTriggerContentMaxDelay(c1089b.m4814d());
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(c1089b.m4816f());
        extras.setRequiresStorageNotLow(c1089b.m4819i());
        boolean z7 = c1814p.f5902k > 0;
        if (C0709a.m3452c() && c1814p.f5908q && !z7) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
