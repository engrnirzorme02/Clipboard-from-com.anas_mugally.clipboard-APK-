package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbbh {
    private final zzbbm zza;
    private final zzbbn.zzt.zza zzb;
    private final boolean zzc;

    private zzbbh() {
        this.zzb = zzbbn.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbbm();
    }

    public static zzbbh zza() {
        return new zzbbh();
    }

    private final synchronized void zzd(int i7) {
        zzbbn.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(C3431F0.m17397U());
        zzbbl zzbblVar = new zzbbl(this.zza, zzaVar.zzbu().zzaN(), null);
        int i8 = i7 - 1;
        zzbblVar.zzb(i8);
        zzbblVar.zza();
        AbstractC3490o0.m17545k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i8, 10))));
    }

    private final synchronized void zze(int i7) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfqm.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(zzf(i7).getBytes());
            } catch (IOException unused) {
                AbstractC3490o0.m17545k("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    AbstractC3490o0.m17545k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            AbstractC3490o0.m17545k("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i7) {
        zzbbn.zzt.zza zzaVar;
        zzaVar = this.zzb;
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", zzaVar.zzf(), Long.valueOf(C7351t.m32357o().mo18161c()), Integer.valueOf(i7 - 1), Base64.encodeToString(zzaVar.zzbu().zzaN(), 3));
    }

    public final synchronized void zzb(zzbbg zzbbgVar) {
        if (this.zzc) {
            try {
                zzbbgVar.zza(this.zzb);
            } catch (NullPointerException e7) {
                C7351t.m32354l().zzg(e7, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i7) {
        if (this.zzc) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfE)).booleanValue()) {
                zze(i7);
            } else {
                zzd(i7);
            }
        }
    }

    public zzbbh(zzbbm zzbbmVar) {
        this.zzb = zzbbn.zzt.zzx();
        this.zza = zzbbmVar;
        this.zzc = ((Boolean) C3250D.m17200c().zzd(zzbci.zzfD)).booleanValue();
    }
}
