package p175X0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p026D0.InterfaceC0176g;
import p168W0.C1802d;

/* JADX INFO: renamed from: X0.h */
/* JADX INFO: loaded from: classes.dex */
public class C1930h {

    /* JADX INFO: renamed from: a */
    private final WorkDatabase f6377a;

    public C1930h(WorkDatabase workDatabase) {
        this.f6377a = workDatabase;
    }

    /* JADX INFO: renamed from: b */
    public static void m7978b(Context context, InterfaceC0176g interfaceC0176g) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j7 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j8 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            interfaceC0176g.mo882c();
            try {
                interfaceC0176g.mo879S("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j7)});
                interfaceC0176g.mo879S("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j8)});
                sharedPreferences.edit().clear().apply();
                interfaceC0176g.mo883h();
            } finally {
                interfaceC0176g.mo885j();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m7979a() {
        Long lMo7517a = this.f6377a.mo14514G().mo7517a("reschedule_needed");
        return lMo7517a != null && lMo7517a.longValue() == 1;
    }

    /* JADX INFO: renamed from: c */
    public void m7980c(boolean z7) {
        this.f6377a.mo14514G().mo7518b(new C1802d("reschedule_needed", z7));
    }
}
