package p396y2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzddz;
import com.google.android.gms.internal.ads.zzdsm;
import p380w2.C7351t;

/* JADX INFO: renamed from: y2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C7535w {
    /* JADX INFO: renamed from: a */
    public static final void m33168a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z7, zzdsm zzdsmVar) {
        if (adOverlayInfoParcel.f14153v == 4 && adOverlayInfoParcel.f14145c == null) {
            InterfaceC3318a interfaceC3318a = adOverlayInfoParcel.f14144b;
            if (interfaceC3318a != null) {
                interfaceC3318a.onAdClicked();
            }
            zzddz zzddzVar = adOverlayInfoParcel.f14139F;
            if (zzddzVar != null) {
                zzddzVar.zzdz();
            }
            Activity activityZzj = adOverlayInfoParcel.f14146d.zzj();
            C7524l c7524l = adOverlayInfoParcel.f14143a;
            Context context2 = (c7524l == null || !c7524l.f30136u || activityZzj == null) ? context : activityZzj;
            C7351t.m32347e();
            C7513a.m33153b(context2, c7524l, adOverlayInfoParcel.f14151t, c7524l != null ? c7524l.f30135t : null, zzdsmVar, adOverlayInfoParcel.f14135B);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f14155x.f30229d);
        intent.putExtra("shouldCallOnOverlayOpened", z7);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!AbstractC3760o.m18196d()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznU)).booleanValue()) {
            C7351t.m32349g();
            C3431F0.m17388D(context, intent, zzdsmVar, adOverlayInfoParcel.f14135B);
        } else {
            C7351t.m32349g();
            C3431F0.m17434y(context, intent);
        }
    }
}
