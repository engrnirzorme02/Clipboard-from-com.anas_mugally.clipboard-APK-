package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C2390a;
import androidx.collection.C2400k;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdng extends zzbgp {
    private final Context zza;
    private final zzdiu zzb;
    private zzdjt zzc;
    private zzdip zzd;

    public zzdng(Context context, zzdiu zzdiuVar, zzdjt zzdjtVar, zzdip zzdipVar) {
        this.zza = context;
        this.zzb = zzdiuVar;
        this.zzc = zzdjtVar;
        this.zzd = zzdipVar;
    }

    final /* synthetic */ zzdip zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbfw zzf(String str) {
        return (zzbfw) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final List zzg() {
        try {
            zzdiu zzdiuVar = this.zzb;
            C2400k c2400kZzaa = zzdiuVar.zzaa();
            C2400k c2400kZzad = zzdiuVar.zzad();
            String[] strArr = new String[c2400kZzaa.size() + c2400kZzad.size()];
            int i7 = 0;
            for (int i8 = 0; i8 < c2400kZzaa.size(); i8++) {
                strArr[i7] = (String) c2400kZzaa.m10300f(i8);
                i7++;
            }
            for (int i9 = 0; i9 < c2400kZzad.size(); i9++) {
                strArr[i7] = (String) c2400kZzad.m10300f(i9);
                i7++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e7) {
            C7351t.m32354l().zzg(e7, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzi(String str) {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null) {
            zzdipVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzj() {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null) {
            zzdipVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final InterfaceC3340f1 zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl() {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null) {
            zzdipVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final InterfaceC3772a zzm() {
        return BinderC3773b.m18221N0(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzn(InterfaceC3772a interfaceC3772a) {
        zzdjt zzdjtVar;
        Object objM18220M0 = BinderC3773b.m18220M0(interfaceC3772a);
        if (!(objM18220M0 instanceof ViewGroup) || (zzdjtVar = this.zzc) == null || !zzdjtVar.zzd((ViewGroup) objM18220M0)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzdnf(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzo() {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null && !zzdipVar.zzM()) {
            return false;
        }
        zzdiu zzdiuVar = this.zzb;
        return zzdiuVar.zzW() != null && zzdiuVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzp() {
        zzdiu zzdiuVar = this.zzb;
        zzedu zzeduVarZzZ = zzdiuVar.zzZ();
        if (zzeduVarZzZ == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Trying to start OMID session before creation.");
            return false;
        }
        C7351t.m32367y().zze(zzeduVarZzZ.zza());
        if (zzdiuVar.zzW() == null) {
            return true;
        }
        zzdiuVar.zzW().zze("onSdkLoaded", new C2390a());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzq(InterfaceC3772a interfaceC3772a) {
        zzdip zzdipVar;
        Object objM18220M0 = BinderC3773b.m18220M0(interfaceC3772a);
        if (!(objM18220M0 instanceof View) || this.zzb.zzZ() == null || (zzdipVar = this.zzd) == null) {
            return;
        }
        zzdipVar.zzN((View) objM18220M0);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzr() {
        try {
            String strZzac = this.zzb.zzac();
            if (Objects.equals(strZzac, "Google")) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(strZzac)) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdip zzdipVar = this.zzd;
                if (zzdipVar != null) {
                    zzdipVar.zzL(strZzac, false);
                }
            }
        } catch (NullPointerException e7) {
            C7351t.m32354l().zzg(e7, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbft zzs() {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e7) {
            C7351t.m32354l().zzg(e7, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzt(InterfaceC3772a interfaceC3772a) {
        zzdjt zzdjtVar;
        Object objM18220M0 = BinderC3773b.m18220M0(interfaceC3772a);
        if (!(objM18220M0 instanceof ViewGroup) || (zzdjtVar = this.zzc) == null || !zzdjtVar.zze((ViewGroup) objM18220M0)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzdnf(this, "_videoMediaView"));
        return true;
    }
}
