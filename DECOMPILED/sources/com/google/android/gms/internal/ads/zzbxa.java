package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.C3446N;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3760o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p170W2.C1841f;
import p227d3.C5228d;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxa implements zzbxf {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhmp zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbxc zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxa(Context context, C7584a c7584a, zzbxc zzbxcVar, String str, zzbxb zzbxbVar) {
        AbstractC3718s.m18084m(zzbxcVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxcVar;
        Iterator it = zzbxcVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhmp zzhmpVarZzg = zzhot.zzg();
        zzhmpVarZzg.zzn(9);
        if (str != null) {
            zzhmpVarZzg.zzb(str);
            zzhmpVarZzg.zzc(str);
        }
        zzhmq zzhmqVarZzc = zzhmr.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzhmqVarZzc.zza(str2);
        }
        zzhmpVarZzg.zzd((zzhmr) zzhmqVarZzc.zzbu());
        zzhof zzhofVarZzc = zzhog.zzc();
        zzhofVarZzc.zzc(C5228d.m24155a(this.zzh).m24153g());
        String str3 = c7584a.f30226a;
        if (str3 != null) {
            zzhofVarZzc.zza(str3);
        }
        long jM7624a = C1841f.m7623f().m7624a(this.zzh);
        if (jM7624a > 0) {
            zzhofVarZzc.zzb(jM7624a);
        }
        zzhmpVarZzg.zzk((zzhog) zzhofVarZzc.zzbu());
        this.zzd = zzhmpVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final zzbxc zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzb(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final boolean zzc() {
        return AbstractC3760o.m18194b() && this.zzi.zzc && !this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzd(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            C7351t.m32349g();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e7) {
                        e = e7;
                        int i7 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e8) {
                    e = e8;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            int i8 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33331f("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e9) {
                        int i9 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("Fail to capture the webview", e9);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzbxe.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                C3431F0.m17396R(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzg(bitmap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zze(String str, Map map, int i7) {
        synchronized (this.zzj) {
            if (i7 == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i7 == 3) {
                    ((zzhod) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzhod zzhodVarZze = zzhoe.zze();
            int iZza = zzhoc.zza(i7);
            if (iZza != 0) {
                zzhodVarZze.zze(iZza);
            }
            zzhodVarZze.zza(linkedHashMap.size());
            zzhodVarZze.zzb(str);
            zzhnc zzhncVarZzc = zzhnf.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhna zzhnaVarZzc = zzhnb.zzc();
                        zzhnaVarZzc.zza(zzhhb.zzs(str2));
                        zzhnaVarZzc.zzb(zzhhb.zzs(str3));
                        zzhncVarZzc.zza((zzhnb) zzhnaVarZzc.zzbu());
                    }
                }
            }
            zzhodVarZze.zzc((zzhnf) zzhncVarZzc.zzbu());
            linkedHashMap.put(str, zzhodVarZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            InterfaceFutureC1673e interfaceFutureC1673eZza = zzgot.zza(Collections.EMPTY_MAP);
            zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzbww
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                    return this.zza.zzh((Map) obj);
                }
            };
            zzgpd zzgpdVar = zzbzh.zzg;
            InterfaceFutureC1673e interfaceFutureC1673eZzj = zzgot.zzj(interfaceFutureC1673eZza, zzgobVar, zzgpdVar);
            InterfaceFutureC1673e interfaceFutureC1673eZzi = zzgot.zzi(interfaceFutureC1673eZzj, 10L, TimeUnit.SECONDS, zzbzh.zzd);
            zzgot.zzq(interfaceFutureC1673eZzj, new zzbwv(this, interfaceFutureC1673eZzi), zzgpdVar);
            zzc.add(interfaceFutureC1673eZzi);
        }
    }

    final /* synthetic */ void zzg(Bitmap bitmap) {
        zzhha zzhhaVarZzx = zzhhb.zzx();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzhhaVarZzx);
        synchronized (this.zzj) {
            zzhmp zzhmpVar = this.zzd;
            zzhnx zzhnxVarZzc = zzhnz.zzc();
            zzhnxVarZzc.zzb(zzhhaVarZzx.zza());
            zzhnxVarZzc.zza("image/png");
            zzhnxVarZzc.zzc(2);
            zzhmpVar.zzj((zzhnz) zzhnxVarZzc.zzbu());
        }
    }

    final /* synthetic */ InterfaceFutureC1673e zzh(Map map) {
        int length;
        zzhod zzhodVar;
        InterfaceFutureC1673e interfaceFutureC1673eZzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            try {
                                length = jSONArrayOptJSONArray.length();
                                synchronized (obj) {
                                    zzhodVar = (zzhod) this.zze.get(str);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (zzhodVar == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            zzbxe.zza(sb.toString());
                        } else {
                            for (int i7 = 0; i7 < length; i7++) {
                                zzhodVar.zzd(jSONArrayOptJSONArray.getJSONObject(i7).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e7) {
                if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
                    int i8 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33327b("Failed to get SafeBrowsing metadata", e7);
                }
                return zzgot.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z7 = this.zza;
        if (!(z7 && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z7 || !this.zzi.zzd))) {
            return zzgot.zza(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzf((zzhoe) ((zzhod) it.next()).zzbu());
                }
                zzhmp zzhmpVar = this.zzd;
                zzhmpVar.zzl(this.zzf);
                zzhmpVar.zzm(this.zzg);
                if (zzbxe.zzb()) {
                    String strZza = zzhmpVar.zza();
                    String strZzg = zzhmpVar.zzg();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + 38 + String.valueOf(strZzg).length() + 15);
                    sb2.append("Sending SB report\n  url: ");
                    sb2.append(strZza);
                    sb2.append("\n  clickUrl: ");
                    sb2.append(strZzg);
                    sb2.append("\n  resources: \n");
                    StringBuilder sb3 = new StringBuilder(sb2.toString());
                    for (zzhoe zzhoeVar : zzhmpVar.zze()) {
                        sb3.append("    [");
                        sb3.append(zzhoeVar.zzd());
                        sb3.append("] ");
                        sb3.append(zzhoeVar.zzc());
                    }
                    zzbxe.zza(sb3.toString());
                }
                InterfaceFutureC1673e interfaceFutureC1673eM17468b = new C3446N(this.zzh).m17468b(1, this.zzi.zzb, null, ((zzhot) zzhmpVar.zzbu()).zzaN());
                if (zzbxe.zzb()) {
                    interfaceFutureC1673eM17468b.addListener(zzbwy.zza, zzbzh.zza);
                }
                interfaceFutureC1673eZzk = zzgot.zzk(interfaceFutureC1673eM17468b, zzbwx.zza, zzbzh.zzg);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceFutureC1673eZzk;
    }
}
