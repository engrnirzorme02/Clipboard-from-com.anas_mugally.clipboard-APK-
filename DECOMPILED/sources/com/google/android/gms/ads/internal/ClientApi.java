package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AbstractBinderC3383q0;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3248C0;
import com.google.android.gms.ads.internal.client.InterfaceC3300U;
import com.google.android.gms.ads.internal.client.InterfaceC3310X0;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.ads.internal.client.InterfaceC3359k0;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbye;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzdjn;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdud;
import com.google.android.gms.internal.ads.zzekk;
import com.google.android.gms.internal.ads.zzexm;
import com.google.android.gms.internal.ads.zzeyz;
import com.google.android.gms.internal.ads.zzfap;
import com.google.android.gms.internal.ads.zzfcc;
import java.util.HashMap;
import p380w2.BinderC7350s;
import p396y2.BinderC7507B;
import p396y2.BinderC7508C;
import p396y2.BinderC7515c;
import p396y2.BinderC7519g;
import p396y2.BinderC7521i;
import p396y2.BinderC7522j;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends AbstractBinderC3383q0 {
    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: E0 */
    public final InterfaceC3359k0 mo17168E0(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7) {
        return zzcgv.zza((Context) BinderC3773b.m18220M0(interfaceC3772a), zzboxVar, i7).zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: H */
    public final InterfaceC3312Y mo17169H(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, String str, zzbox zzboxVar, int i7) {
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        zzeyz zzeyzVarZzh = zzcgv.zza(context, zzboxVar, i7).zzh();
        zzeyzVarZzh.zzd(context);
        zzeyzVarZzh.zzb(c3369m2);
        zzeyzVarZzh.zzc(str);
        return zzeyzVarZzh.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: K0 */
    public final InterfaceC3310X0 mo17170K0(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7) {
        return zzcgv.zza((Context) BinderC3773b.m18220M0(interfaceC3772a), zzboxVar, i7).zzA();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: b */
    public final zzbsp mo17171b(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7) {
        return zzcgv.zza((Context) BinderC3773b.m18220M0(interfaceC3772a), zzboxVar, i7).zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: c */
    public final zzbga mo17172c(InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2) {
        return new zzdjp((FrameLayout) BinderC3773b.m18220M0(interfaceC3772a), (FrameLayout) BinderC3773b.m18220M0(interfaceC3772a2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: c0 */
    public final zzbgg mo17173c0(InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2, InterfaceC3772a interfaceC3772a3) {
        return new zzdjn((View) BinderC3773b.m18220M0(interfaceC3772a), (HashMap) BinderC3773b.m18220M0(interfaceC3772a2), (HashMap) BinderC3773b.m18220M0(interfaceC3772a3));
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: f */
    public final zzbwa mo17174f(InterfaceC3772a interfaceC3772a, String str, zzbox zzboxVar, int i7) {
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        zzfcc zzfccVarZzo = zzcgv.zza(context, zzboxVar, i7).zzo();
        zzfccVarZzo.zzc(context);
        zzfccVarZzo.zzb(str);
        return zzfccVarZzo.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: j */
    public final InterfaceC3300U mo17175j(InterfaceC3772a interfaceC3772a, String str, zzbox zzboxVar, int i7) {
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        return new zzekk(zzcgv.zza(context, zzboxVar, i7), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: m */
    public final zzbye mo17176m(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7) {
        return zzcgv.zza((Context) BinderC3773b.m18220M0(interfaceC3772a), zzboxVar, i7).zzq();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: n */
    public final InterfaceC3312Y mo17177n(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, String str, zzbox zzboxVar, int i7) {
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        zzexm zzexmVarZzj = zzcgv.zza(context, zzboxVar, i7).zzj();
        zzexmVarZzj.zzb(str);
        zzexmVarZzj.zzc(context);
        return zzexmVarZzj.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: p0 */
    public final InterfaceC3312Y mo17178p0(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, String str, int i7) {
        return new BinderC7350s((Context) BinderC3773b.m18220M0(interfaceC3772a), c3369m2, str, new C7584a(ModuleDescriptor.MODULE_VERSION, i7, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: q0 */
    public final zzbko mo17179q0(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7, zzbkl zzbklVar) {
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        zzdud zzdudVarZzy = zzcgv.zza(context, zzboxVar, i7).zzy();
        zzdudVarZzy.zzc(context);
        zzdudVarZzy.zzb(zzbklVar);
        return zzdudVarZzy.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: t */
    public final zzbvk mo17180t(InterfaceC3772a interfaceC3772a, zzbox zzboxVar, int i7) {
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        zzfcc zzfccVarZzo = zzcgv.zza(context, zzboxVar, i7).zzo();
        zzfccVarZzo.zzc(context);
        return zzfccVarZzo.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: v0 */
    public final InterfaceC3248C0 mo17181v0(InterfaceC3772a interfaceC3772a, int i7) {
        return zzcgv.zza((Context) BinderC3773b.m18220M0(interfaceC3772a), null, i7).zze();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    /* JADX INFO: renamed from: z */
    public final InterfaceC3312Y mo17182z(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, String str, zzbox zzboxVar, int i7) {
        Context context = (Context) BinderC3773b.m18220M0(interfaceC3772a);
        zzfap zzfapVarZzl = zzcgv.zza(context, zzboxVar, i7).zzl();
        zzfapVarZzl.zzd(context);
        zzfapVarZzl.zzb(c3369m2);
        zzfapVarZzl.zzc(str);
        return zzfapVarZzl.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3387r0
    public final zzbsw zzg(InterfaceC3772a interfaceC3772a) {
        Activity activity = (Activity) BinderC3773b.m18220M0(interfaceC3772a);
        AdOverlayInfoParcel adOverlayInfoParcelM17364T = AdOverlayInfoParcel.m17364T(activity.getIntent());
        if (adOverlayInfoParcelM17364T == null) {
            return new BinderC7508C(activity);
        }
        int i7 = adOverlayInfoParcelM17364T.f14153v;
        if (i7 == 1) {
            return new BinderC7507B(activity);
        }
        if (i7 == 2) {
            return new BinderC7521i(activity);
        }
        if (i7 == 3) {
            return new BinderC7522j(activity);
        }
        if (i7 != 4) {
            return i7 != 5 ? new BinderC7508C(activity) : new BinderC7519g(activity);
        }
        return new BinderC7515c(activity, adOverlayInfoParcelM17364T);
    }
}
