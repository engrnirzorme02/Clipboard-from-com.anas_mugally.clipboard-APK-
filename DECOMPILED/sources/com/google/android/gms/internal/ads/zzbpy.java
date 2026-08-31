package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p012B2.AbstractC0060a;
import p012B2.AbstractC0079t;
import p012B2.AbstractC0082w;
import p012B2.C0067h;
import p012B2.C0068i;
import p012B2.C0070k;
import p012B2.C0073n;
import p012B2.C0075p;
import p012B2.C0078s;
import p012B2.InterfaceC0065f;
import p012B2.InterfaceC0066g;
import p012B2.InterfaceC0071l;
import p012B2.InterfaceC0072m;
import p012B2.InterfaceC0077r;
import p012B2.InterfaceC0081v;
import p012B2.InterfaceC0083x;
import p314o2.AbstractC6543C;
import p314o2.C6550b;
import p314o2.C6556h;
import p314o2.EnumC6551c;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbpy extends zzboz {
    private final Object zza;
    private zzbqa zzb;
    private zzbvs zzc;
    private InterfaceC3772a zzd;
    private View zze;
    private InterfaceC0072m zzf;
    private AbstractC0082w zzg;
    private AbstractC0079t zzh;
    private InterfaceC0077r zzi;
    private InterfaceC0071l zzj;
    private InterfaceC0066g zzk;
    private final String zzl = "";

    public zzbpy(AbstractC0060a abstractC0060a) {
        this.zza = abstractC0060a;
    }

    private final Bundle zzV(String str, C3349h2 c3349h2, String str2) throws RemoteException {
        AbstractC7599p.m33326a("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (c3349h2 != null) {
                    bundle.putInt("tagForChildDirectedTreatment", c3349h2.f13955r);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            AbstractC7599p.m33329d("", th);
            throw new RemoteException();
        }
    }

    private final Bundle zzW(C3349h2 c3349h2) {
        Bundle bundle;
        Bundle bundle2 = c3349h2.f13961x;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final boolean zzX(C3349h2 c3349h2) {
        if (c3349h2.f13954f) {
            return true;
        }
        C3244B.m17190a();
        return C7590g.m33291z();
    }

    private static final String zzY(String str, C3349h2 c3349h2) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return c3349h2.f13941F;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzA(boolean z7) {
        Object obj = this.zza;
        if (obj instanceof InterfaceC0081v) {
            try {
                ((InterfaceC0081v) obj).onImmersiveModeUpdated(z7);
                return;
            } catch (Throwable th) {
                AbstractC7599p.m33329d("", th);
                return;
            }
        }
        String canonicalName = InterfaceC0081v.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        AbstractC7599p.m33326a(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final InterfaceC3340f1 zzB() {
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

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpm zzC() {
        AbstractC0082w abstractC0082w;
        AbstractC0082w abstractC0082wZzb;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof AbstractC0060a) || (abstractC0082w = this.zzg) == null) {
                return null;
            }
            return new zzbqe(abstractC0082w);
        }
        zzbqa zzbqaVar = this.zzb;
        if (zzbqaVar == null || (abstractC0082wZzb = zzbqaVar.zzb()) == null) {
            return null;
        }
        return new zzbqe(abstractC0082wZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzD(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof AbstractC0060a) {
            AbstractC7599p.m33326a("Requesting rewarded ad from adapter.");
            try {
                ((AbstractC0060a) obj).loadRewardedAd(new C0078s((Context) BinderC3773b.m18220M0(interfaceC3772a), "", zzV(str, c3349h2, null), zzW(c3349h2), zzX(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzY(str, c3349h2), ""), new zzbpw(this, zzbpdVar));
                return;
            } catch (Exception e7) {
                AbstractC7599p.m33329d("", e7);
                zzbou.zza(interfaceC3772a, e7, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = AbstractC0060a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzE(InterfaceC3772a interfaceC3772a) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof AbstractC0060a) {
            AbstractC7599p.m33326a("Show rewarded ad from adapter.");
            AbstractC7599p.m33328c("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC0060a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzF(InterfaceC3772a interfaceC3772a, zzblo zzbloVar, List list) throws RemoteException {
        byte b7;
        Object obj = this.zza;
        if (!(obj instanceof AbstractC0060a)) {
            throw new RemoteException();
        }
        zzbpr zzbprVar = new zzbpr(this, zzbloVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzblu zzbluVar = (zzblu) it.next();
            switch (zzbluVar.zza) {
                case "banner":
                    b7 = 0;
                    break;
                case "native":
                    b7 = 4;
                    break;
                case "rewarded":
                    b7 = 2;
                    break;
                case "interstitial":
                    b7 = 1;
                    break;
                case "app_open":
                    b7 = 5;
                    break;
                case "app_open_ad":
                    b7 = 6;
                    break;
                case "rewarded_interstitial":
                    b7 = 3;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            EnumC6551c enumC6551c = null;
            switch (b7) {
                case 0:
                    enumC6551c = EnumC6551c.BANNER;
                    break;
                case 1:
                    enumC6551c = EnumC6551c.INTERSTITIAL;
                    break;
                case 2:
                    enumC6551c = EnumC6551c.REWARDED;
                    break;
                case 3:
                    enumC6551c = EnumC6551c.REWARDED_INTERSTITIAL;
                    break;
                case 4:
                    enumC6551c = EnumC6551c.NATIVE;
                    break;
                case 5:
                    enumC6551c = EnumC6551c.APP_OPEN_AD;
                    break;
                case 6:
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmF)).booleanValue()) {
                        enumC6551c = EnumC6551c.APP_OPEN_AD;
                    }
                    break;
            }
            if (enumC6551c != null) {
                arrayList.add(new C0070k(enumC6551c, zzbluVar.zzb));
            }
        }
        ((AbstractC0060a) obj).initialize((Context) BinderC3773b.m18220M0(interfaceC3772a), zzbprVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzG(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof AbstractC0060a) {
            AbstractC7599p.m33326a("Requesting rewarded interstitial ad from adapter.");
            try {
                ((AbstractC0060a) obj).loadRewardedInterstitialAd(new C0078s((Context) BinderC3773b.m18220M0(interfaceC3772a), "", zzV(str, c3349h2, null), zzW(c3349h2), zzX(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzY(str, c3349h2), ""), new zzbpw(this, zzbpdVar));
                return;
            } catch (Exception e7) {
                zzbou.zza(interfaceC3772a, e7, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = AbstractC0060a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrl zzH() {
        Object obj = this.zza;
        if (!(obj instanceof AbstractC0060a)) {
            return null;
        }
        ((AbstractC0060a) obj).getVersionInfo();
        return zzbrl.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrl zzI() {
        Object obj = this.zza;
        if (!(obj instanceof AbstractC0060a)) {
            return null;
        }
        ((AbstractC0060a) obj).getSDKVersionInfo();
        return zzbrl.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzJ(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, C3349h2 c3349h2, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof AbstractC0060a)) {
            String canonicalName = AbstractC0060a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            AbstractC7599p.m33331f(sb.toString());
            throw new RemoteException();
        }
        AbstractC7599p.m33326a("Requesting interscroller ad from adapter.");
        try {
            AbstractC0060a abstractC0060a = (AbstractC0060a) obj;
            zzbpq zzbpqVar = new zzbpq(this, zzbpdVar, abstractC0060a);
            zzV(str, c3349h2, str2);
            zzW(c3349h2);
            zzX(c3349h2);
            Location location = c3349h2.f13959v;
            zzY(str, c3349h2);
            AbstractC6543C.m27791c(c3369m2.f14026e, c3369m2.f14023b);
            zzbpqVar.onFailure(new C6550b(7, abstractC0060a.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
        } catch (Exception e7) {
            AbstractC7599p.m33329d("", e7);
            zzbou.zza(interfaceC3772a, e7, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpg zzK() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzL(InterfaceC3772a interfaceC3772a) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof AbstractC0060a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzh();
                return;
            } else {
                AbstractC7599p.m33326a("Show interstitial ad from adapter.");
                AbstractC7599p.m33328c("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = AbstractC0060a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzM(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof AbstractC0060a) {
            AbstractC7599p.m33326a("Requesting app open ad from adapter.");
            try {
                ((AbstractC0060a) obj).loadAppOpenAd(new C0067h((Context) BinderC3773b.m18220M0(interfaceC3772a), "", zzV(str, c3349h2, null), zzW(c3349h2), zzX(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzY(str, c3349h2), ""), new zzbpx(this, zzbpdVar));
                return;
            } catch (Exception e7) {
                AbstractC7599p.m33329d("", e7);
                zzbou.zza(interfaceC3772a, e7, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = AbstractC0060a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzN(InterfaceC3772a interfaceC3772a) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof AbstractC0060a) {
            AbstractC7599p.m33326a("Show app open ad from adapter.");
            AbstractC7599p.m33328c("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC0060a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpi zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpj zzP() {
        return null;
    }

    final /* synthetic */ void zzQ(AbstractC0082w abstractC0082w) {
        this.zzg = abstractC0082w;
    }

    final /* synthetic */ void zzR(AbstractC0079t abstractC0079t) {
    }

    final /* synthetic */ void zzS(InterfaceC0077r interfaceC0077r) {
    }

    final /* synthetic */ void zzT(InterfaceC0071l interfaceC0071l) {
    }

    final /* synthetic */ void zzU(InterfaceC0066g interfaceC0066g) {
    }

    final /* synthetic */ Object zzb() {
        return this.zza;
    }

    final /* synthetic */ void zzc(View view) {
        this.zze = view;
    }

    final /* synthetic */ void zzd(InterfaceC0072m interfaceC0072m) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zze(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, C3349h2 c3349h2, String str, zzbpd zzbpdVar) throws RemoteException {
        zzj(interfaceC3772a, c3369m2, c3349h2, str, null, zzbpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final InterfaceC3772a zzf() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return BinderC3773b.m18221N0(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                AbstractC7599p.m33329d("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof AbstractC0060a) {
            return BinderC3773b.m18221N0(this.zze);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = AbstractC0060a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzg(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, zzbpd zzbpdVar) throws RemoteException {
        zzk(interfaceC3772a, c3349h2, str, null, zzbpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzh() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            AbstractC7599p.m33326a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                AbstractC7599p.m33329d("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzi() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof InterfaceC0065f) {
            try {
                ((InterfaceC0065f) obj).onDestroy();
            } catch (Throwable th) {
                AbstractC7599p.m33329d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzj(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, C3349h2 c3349h2, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        String str3;
        Object obj = this.zza;
        boolean z7 = obj instanceof MediationBannerAdapter;
        if (!z7 && !(obj instanceof AbstractC0060a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC0060a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            AbstractC7599p.m33331f(sb.toString());
            throw new RemoteException();
        }
        AbstractC7599p.m33326a("Requesting banner ad from adapter.");
        C6556h c6556hM27790b = c3369m2.f14035y ? AbstractC6543C.m27790b(c3369m2.f14026e, c3369m2.f14023b) : AbstractC6543C.m27789a(c3369m2.f14026e, c3369m2.f14023b, c3369m2.f14022a);
        if (!z7) {
            Object obj2 = this.zza;
            if (obj2 instanceof AbstractC0060a) {
                try {
                    ((AbstractC0060a) obj2).loadBannerAd(new C0068i((Context) BinderC3773b.m18220M0(interfaceC3772a), "", zzV(str, c3349h2, str2), zzW(c3349h2), zzX(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzY(str, c3349h2), c6556hM27790b, this.zzl), new zzbps(this, zzbpdVar));
                    return;
                } catch (Throwable th) {
                    AbstractC7599p.m33329d("", th);
                    zzbou.zza(interfaceC3772a, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = c3349h2.f13953e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j7 = c3349h2.f13950b;
            zzbpp zzbppVar = new zzbpp(j7 == -1 ? null : new Date(j7), c3349h2.f13952d, hashSet, c3349h2.f13959v, zzX(c3349h2), c3349h2.f13955r, c3349h2.f13938C, c3349h2.f13940E, zzY(str, c3349h2));
            Bundle bundle = c3349h2.f13961x;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null;
            str3 = "";
            try {
                mediationBannerAdapter.requestBannerAd((Context) BinderC3773b.m18220M0(interfaceC3772a), new zzbqa(zzbpdVar), zzV(str, c3349h2, str2), c6556hM27790b, zzbppVar, bundle2);
            } catch (Throwable th2) {
                th = th2;
                AbstractC7599p.m33329d(str3, th);
                zzbou.zza(interfaceC3772a, th, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        } catch (Throwable th3) {
            th = th3;
            str3 = "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzk(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Object obj = this.zza;
        boolean z7 = obj instanceof MediationInterstitialAdapter;
        if (!z7 && !(obj instanceof AbstractC0060a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC0060a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            AbstractC7599p.m33331f(sb.toString());
            throw new RemoteException();
        }
        AbstractC7599p.m33326a("Requesting interstitial ad from adapter.");
        if (!z7) {
            Object obj2 = this.zza;
            if (obj2 instanceof AbstractC0060a) {
                try {
                    ((AbstractC0060a) obj2).loadInterstitialAd(new C0073n((Context) BinderC3773b.m18220M0(interfaceC3772a), "", zzV(str, c3349h2, str2), zzW(c3349h2), zzX(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzY(str, c3349h2), this.zzl), new zzbpt(this, zzbpdVar));
                    return;
                } catch (Throwable th) {
                    AbstractC7599p.m33329d("", th);
                    zzbou.zza(interfaceC3772a, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = c3349h2.f13953e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j7 = c3349h2.f13950b;
            zzbpp zzbppVar = new zzbpp(j7 == -1 ? null : new Date(j7), c3349h2.f13952d, hashSet, c3349h2.f13959v, zzX(c3349h2), c3349h2.f13955r, c3349h2.f13938C, c3349h2.f13940E, zzY(str, c3349h2));
            Bundle bundle = c3349h2.f13961x;
            mediationInterstitialAdapter.requestInterstitialAd((Context) BinderC3773b.m18220M0(interfaceC3772a), new zzbqa(zzbpdVar), zzV(str, c3349h2, str2), zzbppVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            AbstractC7599p.m33329d("", th2);
            zzbou.zza(interfaceC3772a, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzl() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof InterfaceC0065f) {
            try {
                ((InterfaceC0065f) obj).onPause();
            } catch (Throwable th) {
                AbstractC7599p.m33329d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzm() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof InterfaceC0065f) {
            try {
                ((InterfaceC0065f) obj).onResume();
            } catch (Throwable th) {
                AbstractC7599p.m33329d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzn(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, zzbvs zzbvsVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof AbstractC0060a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = interfaceC3772a;
            this.zzc = zzbvsVar;
            zzbvsVar.zze(BinderC3773b.m18221N0(obj));
            return;
        }
        String canonicalName = AbstractC0060a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzo(C3349h2 c3349h2, String str) throws RemoteException {
        zzv(c3349h2, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzp() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof AbstractC0060a) {
            AbstractC7599p.m33328c("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC0060a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzq() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof AbstractC0060a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        String canonicalName = AbstractC0060a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzr(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, String str2, zzbpd zzbpdVar, zzbfl zzbflVar, List list) throws RemoteException {
        Object obj = this.zza;
        boolean z7 = obj instanceof MediationNativeAdapter;
        if (!z7 && !(obj instanceof AbstractC0060a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC0060a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            AbstractC7599p.m33331f(sb.toString());
            throw new RemoteException();
        }
        AbstractC7599p.m33326a("Requesting native ad from adapter.");
        if (z7) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list2 = c3349h2.f13953e;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j7 = c3349h2.f13950b;
                zzbqd zzbqdVar = new zzbqd(j7 == -1 ? null : new Date(j7), c3349h2.f13952d, hashSet, c3349h2.f13959v, zzX(c3349h2), c3349h2.f13955r, zzbflVar, list, c3349h2.f13938C, c3349h2.f13940E, zzY(str, c3349h2));
                Bundle bundle = c3349h2.f13961x;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbqa(zzbpdVar);
                mediationNativeAdapter.requestNativeAd((Context) BinderC3773b.m18220M0(interfaceC3772a), this.zzb, zzV(str, c3349h2, str2), zzbqdVar, bundle2);
                return;
            } catch (Throwable th) {
                AbstractC7599p.m33329d("", th);
                zzbou.zza(interfaceC3772a, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof AbstractC0060a) {
            try {
                ((AbstractC0060a) obj2).loadNativeAdMapper(new C0075p((Context) BinderC3773b.m18220M0(interfaceC3772a), "", zzV(str, c3349h2, str2), zzW(c3349h2), zzX(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzY(str, c3349h2), this.zzl, zzbflVar), new zzbpv(this, zzbpdVar));
            } catch (Throwable th2) {
                AbstractC7599p.m33329d("", th2);
                zzbou.zza(interfaceC3772a, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((AbstractC0060a) this.zza).loadNativeAd(new C0075p((Context) BinderC3773b.m18220M0(interfaceC3772a), "", zzV(str, c3349h2, str2), zzW(c3349h2), zzX(c3349h2), c3349h2.f13959v, c3349h2.f13955r, c3349h2.f13940E, zzY(str, c3349h2), this.zzl, zzbflVar), new zzbpu(this, zzbpdVar));
                } catch (Throwable th3) {
                    AbstractC7599p.m33329d("", th3);
                    zzbou.zza(interfaceC3772a, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzs() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzt() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzu() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzv(C3349h2 c3349h2, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof AbstractC0060a) {
            zzD(this.zzd, c3349h2, str, new zzbqb((AbstractC0060a) obj, this.zzc));
            return;
        }
        String canonicalName = AbstractC0060a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        AbstractC7599p.m33331f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzw(InterfaceC3772a interfaceC3772a) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzy(InterfaceC3772a interfaceC3772a, zzbvs zzbvsVar, List list) throws RemoteException {
        AbstractC7599p.m33331f("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbgq zzz() {
        zzbgr zzbgrVarZze;
        zzbqa zzbqaVar = this.zzb;
        if (zzbqaVar == null || (zzbgrVarZze = zzbqaVar.zze()) == null) {
            return null;
        }
        return zzbgrVarZze.zza();
    }

    public zzbpy(InterfaceC0065f interfaceC0065f) {
        this.zza = interfaceC0065f;
    }
}
