package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p012B2.C0067h;
import p012B2.C0068i;
import p012B2.C0070k;
import p012B2.C0073n;
import p012B2.C0075p;
import p012B2.C0078s;
import p012B2.InterfaceC0066g;
import p012B2.InterfaceC0072m;
import p012B2.InterfaceC0077r;
import p012B2.InterfaceC0083x;
import p028D2.C0187a;
import p314o2.AbstractC6543C;
import p314o2.C6550b;
import p314o2.EnumC6551c;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbrj extends zzbqv {
    private final RtbAdapter zza;
    private InterfaceC0072m zzb;
    private InterfaceC0077r zzc;
    private InterfaceC0066g zzd;
    private String zze = "";

    public zzbrj(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(C3349h2 c3349h2) {
        Bundle bundle;
        Bundle bundle2 = c3349h2.f13961x;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzw(String str) throws RemoteException {
        AbstractC7599p.m33331f("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e7) {
            AbstractC7599p.m33329d("", e7);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(C3349h2 c3349h2) {
        if (c3349h2.f13954f) {
            return true;
        }
        C3244B.m17190a();
        return C7590g.m33291z();
    }

    private static final String zzy(String str, C3349h2 c3349h2) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return c3349h2.f13941F;
        }
    }

    final /* synthetic */ void zzc(InterfaceC0072m interfaceC0072m) {
    }

    final /* synthetic */ void zzd(InterfaceC0077r interfaceC0077r) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zze(InterfaceC3772a interfaceC3772a, String str, Bundle bundle, Bundle bundle2, C3369m2 c3369m2, zzbqz zzbqzVar) throws RemoteException {
        EnumC6551c enumC6551c;
        try {
            zzbrh zzbrhVar = new zzbrh(this, zzbqzVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str) {
                case "banner":
                    enumC6551c = EnumC6551c.BANNER;
                    C0070k c0070k = new C0070k(enumC6551c, bundle2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c0070k);
                    rtbAdapter.collectSignals(new C0187a((Context) BinderC3773b.m18220M0(interfaceC3772a), arrayList, bundle, AbstractC6543C.m27789a(c3369m2.f14026e, c3369m2.f14023b, c3369m2.f14022a)), zzbrhVar);
                    return;
                case "interstitial":
                    enumC6551c = EnumC6551c.INTERSTITIAL;
                    C0070k c0070k2 = new C0070k(enumC6551c, bundle2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c0070k2);
                    rtbAdapter.collectSignals(new C0187a((Context) BinderC3773b.m18220M0(interfaceC3772a), arrayList2, bundle, AbstractC6543C.m27789a(c3369m2.f14026e, c3369m2.f14023b, c3369m2.f14022a)), zzbrhVar);
                    return;
                case "rewarded":
                    enumC6551c = EnumC6551c.REWARDED;
                    C0070k c0070k3 = new C0070k(enumC6551c, bundle2);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(c0070k3);
                    rtbAdapter.collectSignals(new C0187a((Context) BinderC3773b.m18220M0(interfaceC3772a), arrayList3, bundle, AbstractC6543C.m27789a(c3369m2.f14026e, c3369m2.f14023b, c3369m2.f14022a)), zzbrhVar);
                    return;
                case "rewarded_interstitial":
                    enumC6551c = EnumC6551c.REWARDED_INTERSTITIAL;
                    C0070k c0070k4 = new C0070k(enumC6551c, bundle2);
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(c0070k4);
                    rtbAdapter.collectSignals(new C0187a((Context) BinderC3773b.m18220M0(interfaceC3772a), arrayList4, bundle, AbstractC6543C.m27789a(c3369m2.f14026e, c3369m2.f14023b, c3369m2.f14022a)), zzbrhVar);
                    return;
                case "native":
                    enumC6551c = EnumC6551c.NATIVE;
                    C0070k c0070k5 = new C0070k(enumC6551c, bundle2);
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(c0070k5);
                    rtbAdapter.collectSignals(new C0187a((Context) BinderC3773b.m18220M0(interfaceC3772a), arrayList5, bundle, AbstractC6543C.m27789a(c3369m2.f14026e, c3369m2.f14023b, c3369m2.f14022a)), zzbrhVar);
                    return;
                case "app_open":
                    enumC6551c = EnumC6551c.APP_OPEN_AD;
                    C0070k c0070k6 = new C0070k(enumC6551c, bundle2);
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(c0070k6);
                    rtbAdapter.collectSignals(new C0187a((Context) BinderC3773b.m18220M0(interfaceC3772a), arrayList6, bundle, AbstractC6543C.m27789a(c3369m2.f14026e, c3369m2.f14023b, c3369m2.f14022a)), zzbrhVar);
                    return;
                case "app_open_ad":
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmF)).booleanValue()) {
                        enumC6551c = EnumC6551c.APP_OPEN_AD;
                        C0070k c0070k7 = new C0070k(enumC6551c, bundle2);
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(c0070k7);
                        rtbAdapter.collectSignals(new C0187a((Context) BinderC3773b.m18220M0(interfaceC3772a), arrayList7, bundle, AbstractC6543C.m27789a(c3369m2.f14026e, c3369m2.f14023b, c3369m2.f14022a)), zzbrhVar);
                        return;
                    }
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            AbstractC7599p.m33329d("Error generating signals for RTB", th);
            zzbou.zza(interfaceC3772a, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final zzbrl zzf() {
        this.zza.getVersionInfo();
        return zzbrl.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final zzbrl zzg() {
        this.zza.getSDKVersionInfo();
        return zzbrl.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final InterfaceC3340f1 zzh() {
        Object obj = this.zza;
        if (obj instanceof InterfaceC0083x) {
            try {
                return ((InterfaceC0083x) obj).getVideoController();
            } catch (Throwable th) {
                AbstractC7599p.m33329d("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzi(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqk zzbqkVar, zzbpd zzbpdVar, C3369m2 c3369m2) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new C0068i((Context) BinderC3773b.m18220M0(interfaceC3772a), str, zzw(str2), zzv(c3349h2), zzx(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzy(str2, c3349h2), AbstractC6543C.m27789a(c3369m2.f14026e, c3369m2.f14023b, c3369m2.f14022a), this.zze), new zzbrb(this, zzbqkVar, zzbpdVar));
        } catch (Throwable th) {
            AbstractC7599p.m33329d("Adapter failed to render banner ad.", th);
            zzbou.zza(interfaceC3772a, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzj(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqn zzbqnVar, zzbpd zzbpdVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new C0073n((Context) BinderC3773b.m18220M0(interfaceC3772a), str, zzw(str2), zzv(c3349h2), zzx(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzy(str2, c3349h2), this.zze), new zzbrd(this, zzbqnVar, zzbpdVar));
        } catch (Throwable th) {
            AbstractC7599p.m33329d("Adapter failed to render interstitial ad.", th);
            zzbou.zza(interfaceC3772a, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzk(InterfaceC3772a interfaceC3772a) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzl(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqt zzbqtVar, zzbpd zzbpdVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new C0078s((Context) BinderC3773b.m18220M0(interfaceC3772a), str, zzw(str2), zzv(c3349h2), zzx(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzy(str2, c3349h2), this.zze), new zzbri(this, zzbqtVar, zzbpdVar));
        } catch (Throwable th) {
            AbstractC7599p.m33329d("Adapter failed to render rewarded ad.", th);
            zzbou.zza(interfaceC3772a, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzm(InterfaceC3772a interfaceC3772a) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzn(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqq zzbqqVar, zzbpd zzbpdVar) throws RemoteException {
        zzr(str, str2, c3349h2, interfaceC3772a, zzbqqVar, zzbpdVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzo(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzp(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqt zzbqtVar, zzbpd zzbpdVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new C0078s((Context) BinderC3773b.m18220M0(interfaceC3772a), str, zzw(str2), zzv(c3349h2), zzx(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzy(str2, c3349h2), this.zze), new zzbri(this, zzbqtVar, zzbpdVar));
        } catch (Throwable th) {
            AbstractC7599p.m33329d("Adapter failed to render rewarded interstitial ad.", th);
            zzbou.zza(interfaceC3772a, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzq(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqk zzbqkVar, zzbpd zzbpdVar, C3369m2 c3369m2) throws RemoteException {
        try {
            zzbrc zzbrcVar = new zzbrc(this, zzbqkVar, zzbpdVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(c3349h2);
            zzx(c3349h2);
            Location location = c3349h2.f13959v;
            zzy(str2, c3349h2);
            AbstractC6543C.m27789a(c3369m2.f14026e, c3369m2.f14023b, c3369m2.f14022a);
            zzbrcVar.onFailure(new C6550b(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
        } catch (Throwable th) {
            AbstractC7599p.m33329d("Adapter failed to render interscroller ad.", th);
            zzbou.zza(interfaceC3772a, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzr(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqq zzbqqVar, zzbpd zzbpdVar, zzbfl zzbflVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAdMapper(new C0075p((Context) BinderC3773b.m18220M0(interfaceC3772a), str, zzw(str2), zzv(c3349h2), zzx(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzy(str2, c3349h2), this.zze, zzbflVar), new zzbre(this, zzbqqVar, zzbpdVar));
        } catch (Throwable th) {
            AbstractC7599p.m33329d("Adapter failed to render native ad.", th);
            zzbou.zza(interfaceC3772a, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                this.zza.loadRtbNativeAd(new C0075p((Context) BinderC3773b.m18220M0(interfaceC3772a), str, zzw(str2), zzv(c3349h2), zzx(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzy(str2, c3349h2), this.zze, zzbflVar), new zzbrf(this, zzbqqVar, zzbpdVar));
            } catch (Throwable th2) {
                AbstractC7599p.m33329d("Adapter failed to render native ad.", th2);
                zzbou.zza(interfaceC3772a, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzs(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqh zzbqhVar, zzbpd zzbpdVar) throws RemoteException {
        try {
            this.zza.loadRtbAppOpenAd(new C0067h((Context) BinderC3773b.m18220M0(interfaceC3772a), str, zzw(str2), zzv(c3349h2), zzx(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzy(str2, c3349h2), this.zze), new zzbrg(this, zzbqhVar, zzbpdVar));
        } catch (Throwable th) {
            AbstractC7599p.m33329d("Adapter failed to render app open ad.", th);
            zzbou.zza(interfaceC3772a, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzt(InterfaceC3772a interfaceC3772a) {
        return false;
    }

    final /* synthetic */ void zzu(InterfaceC0066g interfaceC0066g) {
    }
}
