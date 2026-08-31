package p175X0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p026D0.InterfaceC0176g;
import p168W0.C1802d;

/* JADX INFO: renamed from: X0.f */
/* JADX INFO: loaded from: classes.dex */
public class C1928f {

    /* JADX INFO: renamed from: a */
    private final WorkDatabase f6375a;

    public C1928f(WorkDatabase workDatabase) {
        this.f6375a = workDatabase;
    }

    /* JADX INFO: renamed from: a */
    public static void m7972a(Context context, InterfaceC0176g interfaceC0176g) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i7 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i8 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            interfaceC0176g.mo882c();
            try {
                interfaceC0176g.mo879S("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i7)});
                interfaceC0176g.mo879S("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i8)});
                sharedPreferences.edit().clear().apply();
                interfaceC0176g.mo883h();
            } finally {
                interfaceC0176g.mo885j();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private int m7973c(String str) {
        this.f6375a.m33029e();
        try {
            Long lMo7517a = this.f6375a.mo14514G().mo7517a(str);
            int i7 = 0;
            int iIntValue = lMo7517a != null ? lMo7517a.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i7 = iIntValue + 1;
            }
            m7974e(str, i7);
            this.f6375a.m33042z();
            return iIntValue;
        } finally {
            this.f6375a.m33031i();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m7974e(String str, int i7) {
        this.f6375a.mo14514G().mo7518b(new C1802d(str, i7));
    }

    /* JADX INFO: renamed from: b */
    public int m7975b() {
        int iM7973c;
        synchronized (C1928f.class) {
            iM7973c = m7973c("next_alarm_manager_id");
        }
        return iM7973c;
    }

    /* JADX INFO: renamed from: d */
    public int m7976d(int i7, int i8) {
        synchronized (C1928f.class) {
            int iM7973c = m7973c("next_job_scheduler_id");
            if (iM7973c < i7 || iM7973c > i8) {
                m7974e("next_job_scheduler_id", i7 + 1);
            } else {
                i7 = iM7973c;
            }
        }
        return i7;
    }
}
