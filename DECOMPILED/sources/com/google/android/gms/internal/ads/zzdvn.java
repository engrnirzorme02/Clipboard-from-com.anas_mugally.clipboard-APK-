package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvn {
    private final zzdux zza;
    private final zzdpz zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzdvn(zzdux zzduxVar, zzdpz zzdpzVar) {
        this.zza = zzduxVar;
        this.zzb = zzdpzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        zzdpy zzdpyVarZzc;
        zzdpy zzdpyVarZzc2;
        zzbrl zzbrlVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzblk zzblkVar = (zzblk) it.next();
                    String string = (!((Boolean) C3250D.m17200c().zzd(zzbci.zzke)).booleanValue() || (zzdpyVarZzc2 = this.zzb.zzc(zzblkVar.zza)) == null || (zzbrlVar = zzdpyVarZzc2.zzc) == null) ? "" : zzbrlVar.toString();
                    String str = string;
                    boolean z7 = ((Boolean) C3250D.m17200c().zzd(zzbci.zzkf)).booleanValue() && (zzdpyVarZzc = this.zzb.zzc(zzblkVar.zza)) != null && zzdpyVarZzc.zzd;
                    List list2 = this.zzd;
                    String str2 = zzblkVar.zza;
                    list2.add(new zzdvm(str2, str, this.zzb.zzd(str2), zzblkVar.zzb ? 1 : 0, zzblkVar.zzd, zzblkVar.zzc, z7));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        this.zza.zzb(new zzdvl(this));
    }

    public final JSONArray zzb() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    zzdux zzduxVar = this.zza;
                    if (!zzduxVar.zze()) {
                        zza();
                        return jSONArray;
                    }
                    zzc(zzduxVar.zzd());
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzdvm) it.next()).zza());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
