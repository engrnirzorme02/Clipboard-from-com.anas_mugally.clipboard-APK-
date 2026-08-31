package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzbcn {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    private final void zzg(Map map, zzbcw zzbcwVar) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (zzbcwVar != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(zzbcwVar.zza())) {
                sb.append("&it=");
                sb.append(zzbcwVar.zza());
            }
            if (!TextUtils.isEmpty(zzbcwVar.zzb())) {
                sb.append("&blat=");
                sb.append(zzbcwVar.zzb());
            }
            string = sb.toString();
        }
        if (!this.zzh.get()) {
            C7351t.m32349g();
            C3431F0.m17425p(this.zze, this.zzf, string);
            return;
        }
        File file = this.zzi;
        if (file == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e7) {
                        int i8 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33332g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e7);
                    }
                } catch (IOException e8) {
                    e = e8;
                    fileOutputStream = fileOutputStream2;
                    int i9 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33332g("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e9) {
                            AbstractC7599p.m33332g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e9);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e10) {
                            int i10 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33332g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public final void zza(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbed.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(zzfqm.zza().zza(externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.zza.zzf();
            }
        });
        Map map2 = this.zzc;
        zzbct zzbctVar = zzbct.zzb;
        map2.put("action", zzbctVar);
        map2.put("ad_format", zzbctVar);
        map2.put("e", zzbct.zzc);
    }

    public final boolean zzb(zzbcx zzbcxVar) {
        return this.zza.offer(zzbcxVar);
    }

    final Map zzc(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zzd(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final zzbct zzd(String str) {
        zzbct zzbctVar = (zzbct) this.zzc.get(str);
        return zzbctVar != null ? zzbctVar : zzbct.zza;
    }

    public final void zze(String str) throws Throwable {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzc(this.zzb, linkedHashMap), null);
    }

    final /* synthetic */ void zzf() throws Throwable {
        while (true) {
            try {
                zzbcx zzbcxVar = (zzbcx) this.zza.take();
                zzbcw zzbcwVarZzc = zzbcxVar.zzc();
                if (!TextUtils.isEmpty(zzbcwVarZzc.zza())) {
                    zzg(zzc(this.zzb, zzbcxVar.zze()), zzbcwVarZzc);
                }
            } catch (InterruptedException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("CsiReporter:reporter interrupted", e7);
                return;
            }
        }
    }
}
