package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.C2895a;
import androidx.work.C2896b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p112O0.AbstractC1107t;
import p112O0.C1089b;
import p112O0.C1099l;
import p112O0.EnumC1098k;
import p388x2.C7403a;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends AbstractBinderC3450P {
    /* JADX INFO: renamed from: L0 */
    private static void m17505L0(Context context) {
        try {
            AbstractC1107t.m4863e(context.getApplicationContext(), new C2895a.b().m14493a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3452Q
    public final boolean zze(InterfaceC3772a interfaceC3772a, String str, String str2) {
        return zzg(interfaceC3772a, new C7403a(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3452Q
    public final void zzf(InterfaceC3772a interfaceC3772a) {
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        m17505L0(context);
        try {
            AbstractC1107t abstractC1107tM4862d = AbstractC1107t.m4862d(context);
            abstractC1107tM4862d.mo4864a("offline_ping_sender_work");
            abstractC1107tM4862d.m4865b((C1099l) ((C1099l.a) ((C1099l.a) new C1099l.a(OfflinePingSender.class).m4872e(new C1089b.a().m4829b(EnumC1098k.CONNECTED).m4828a())).m4870a("offline_ping_sender_work")).m4871b());
        } catch (IllegalStateException e7) {
            AbstractC7599p.m33332g("Failed to instantiate WorkManager.", e7);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3452Q
    public final boolean zzg(InterfaceC3772a interfaceC3772a, C7403a c7403a) throws Throwable {
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        m17505L0(context);
        C1089b c1089bM4828a = new C1089b.a().m4829b(EnumC1098k.CONNECTED).m4828a();
        try {
            AbstractC1107t.m4862d(context).m4865b((C1099l) ((C1099l.a) ((C1099l.a) ((C1099l.a) new C1099l.a(OfflineNotificationPoster.class).m4872e(c1089bM4828a)).m4873f(new C2896b.a().m14508d("uri", c7403a.f29650a).m14508d("gws_query_id", c7403a.f29651b).m14508d("image_url", c7403a.f29652c).m14505a())).m4870a("offline_notification_work")).m4871b());
            return true;
        } catch (IllegalStateException e7) {
            AbstractC7599p.m33332g("Failed to instantiate WorkManager.", e7);
            return false;
        }
    }
}
