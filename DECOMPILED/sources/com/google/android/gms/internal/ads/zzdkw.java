package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3260G0;
import com.google.android.gms.ads.internal.client.InterfaceC3272K0;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdkw implements zzdjc, zzdau {
    private final zzbpm zza;
    private final zzcwk zzb;
    private final zzcyl zzc;
    private final zzcvq zzd;
    private final zzddx zze;
    private final Context zzf;
    private final zzfcj zzg;
    private final C7584a zzh;
    private final zzfdc zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbpi zzm;
    private final zzbpj zzn;

    public zzdkw(zzbpi zzbpiVar, zzbpj zzbpjVar, zzbpm zzbpmVar, zzcwk zzcwkVar, zzcyl zzcylVar, zzcvq zzcvqVar, zzddx zzddxVar, Context context, zzfcj zzfcjVar, C7584a c7584a, zzfdc zzfdcVar) {
        this.zzm = zzbpiVar;
        this.zzn = zzbpjVar;
        this.zza = zzbpmVar;
        this.zzb = zzcwkVar;
        this.zzc = zzcylVar;
        this.zzd = zzcvqVar;
        this.zze = zzddxVar;
        this.zzf = context;
        this.zzg = zzfcjVar;
        this.zzh = c7584a;
        this.zzi = zzfdcVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    private final void zzi(View view) {
        try {
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null && !zzbpmVar.zzu()) {
                zzbpmVar.zzw(BinderC3773b.m18221N0(view));
                this.zzd.onAdClicked();
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlB)).booleanValue()) {
                    this.zze.zzdz();
                    return;
                }
                return;
            }
            zzbpi zzbpiVar = this.zzm;
            if (zzbpiVar != null && !zzbpiVar.zzq()) {
                zzbpiVar.zzn(BinderC3773b.m18221N0(view));
                this.zzd.onAdClicked();
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlB)).booleanValue()) {
                    this.zze.zzdz();
                    return;
                }
                return;
            }
            zzbpj zzbpjVar = this.zzn;
            if (zzbpjVar == null || zzbpjVar.zzo()) {
                return;
            }
            zzbpjVar.zzl(BinderC3773b.m18221N0(view));
            this.zzd.onAdClicked();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlB)).booleanValue()) {
                this.zze.zzdz();
            }
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed to call handleClick", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzA() {
        try {
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null) {
                zzbpmVar.zzC();
            }
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed to call destroy", e7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:71:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00c9 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        InterfaceC3772a interfaceC3772aZzq;
        try {
            InterfaceC3772a interfaceC3772aM18221N0 = BinderC3773b.m18221N0(view);
            JSONObject jSONObject = this.zzg.zzaj;
            boolean z7 = true;
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbK)).booleanValue() && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbL)).booleanValue() && next.equals("3010")) {
                                zzbpm zzbpmVar = this.zza;
                                Object objM18220M0 = null;
                                if (zzbpmVar != null) {
                                    try {
                                        interfaceC3772aZzq = zzbpmVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbpi zzbpiVar = this.zzm;
                                    if (zzbpiVar != null) {
                                        interfaceC3772aZzq = zzbpiVar.zzw();
                                    } else {
                                        zzbpj zzbpjVar = this.zzn;
                                        interfaceC3772aZzq = zzbpjVar != null ? zzbpjVar.zzu() : null;
                                    }
                                }
                                if (interfaceC3772aZzq != null) {
                                    objM18220M0 = BinderC3773b.m18220M0(interfaceC3772aZzq);
                                }
                                if (objM18220M0 != null) {
                                    cls = objM18220M0.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    AbstractC3453S.m17474a(jSONArrayOptJSONArray, arrayList);
                                    C7351t.m32349g();
                                    classLoader = this.zzf.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    AbstractC3453S.m17474a(jSONArrayOptJSONArray, arrayList2);
                                    C7351t.m32349g();
                                    classLoader = this.zzf.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z7 = false;
                        break;
                    }
                }
            }
            this.zzl = z7;
            HashMap mapZzB = zzB(map);
            HashMap mapZzB2 = zzB(map2);
            zzbpm zzbpmVar2 = this.zza;
            if (zzbpmVar2 != null) {
                zzbpmVar2.zzx(interfaceC3772aM18221N0, BinderC3773b.m18221N0(mapZzB), BinderC3773b.m18221N0(mapZzB2));
                return;
            }
            zzbpi zzbpiVar2 = this.zzm;
            if (zzbpiVar2 != null) {
                zzbpiVar2.zzy(interfaceC3772aM18221N0, BinderC3773b.m18221N0(mapZzB), BinderC3773b.m18221N0(mapZzB2));
                zzbpiVar2.zzo(interfaceC3772aM18221N0);
                return;
            }
            zzbpj zzbpjVar2 = this.zzn;
            if (zzbpjVar2 != null) {
                zzbpjVar2.zzw(interfaceC3772aM18221N0, BinderC3773b.m18221N0(mapZzB), BinderC3773b.m18221N0(mapZzB2));
                zzbpjVar2.zzm(interfaceC3772aM18221N0);
            }
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed to call trackView", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzb(View view, Map map) {
        try {
            InterfaceC3772a interfaceC3772aM18221N0 = BinderC3773b.m18221N0(view);
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar != null) {
                zzbpmVar.zzy(interfaceC3772aM18221N0);
                return;
            }
            zzbpi zzbpiVar = this.zzm;
            if (zzbpiVar != null) {
                zzbpiVar.zzs(interfaceC3772aM18221N0);
                return;
            }
            zzbpj zzbpjVar = this.zzn;
            if (zzbpjVar != null) {
                zzbpjVar.zzq(interfaceC3772aM18221N0);
            }
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed to call untrackView", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzc(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdL() {
        try {
            zzbpm zzbpmVar = this.zza;
            if (zzbpmVar == null || !zzbpmVar.zzt()) {
                return;
            }
            zzfcj zzfcjVar = this.zzg;
            if (zzfcjVar.zze != 4 && !zzfcjVar.zzaD) {
                return;
            }
            zzbpmVar.zzv();
            this.zzb.zza();
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed to report impression from an adapter", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdM() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzf(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType, int i7) {
        if (!this.zzk) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzp(zzbhn zzbhnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzr(InterfaceC3272K0 interfaceC3272K0) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzs(InterfaceC3260G0 interfaceC3260G0) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzt() {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = C7351t.m32361s().m17592g(this.zzf, this.zzh.f30226a, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbpm zzbpmVar = this.zza;
                if (zzbpmVar == null) {
                    zzbpi zzbpiVar = this.zzm;
                    if (zzbpiVar != null && !zzbpiVar.zzp()) {
                        zzbpiVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbpj zzbpjVar = this.zzn;
                    if (zzbpjVar == null || zzbpjVar.zzn()) {
                        return;
                    }
                    zzbpjVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfcj zzfcjVar = this.zzg;
                if (zzfcjVar.zzaD) {
                    if (zzbpmVar.zzt()) {
                        return;
                    }
                    zzbpmVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbpmVar.zzt() && zzfcjVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbpmVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed to call recordImpression", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjc
    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
