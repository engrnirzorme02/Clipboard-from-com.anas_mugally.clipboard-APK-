package com.google.android.gms.internal.p411firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.C4861j0;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaaz implements zzafv<zzahl> {
    private final /* synthetic */ zzafs zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ C4861j0 zze;
    private final /* synthetic */ zzael zzf;
    private final /* synthetic */ zzahv zzg;

    zzaaz(zzaar zzaarVar, zzafs zzafsVar, String str, String str2, Boolean bool, C4861j0 c4861j0, zzael zzaelVar, zzahv zzahvVar) {
        this.zza = zzafsVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = c4861j0;
        this.zzf = zzaelVar;
        this.zzg = zzahvVar;
        Objects.requireNonNull(zzaarVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahl zzahlVar) {
        List<zzahk> listZza = zzahlVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzahk zzahkVar = listZza.get(0);
        zzaia zzaiaVarZzf = zzahkVar.zzf();
        List<zzaib> listZza2 = zzaiaVarZzf != null ? zzaiaVarZzf.zza() : null;
        if (listZza2 != null && !listZza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                listZza2.get(0).zza(this.zzc);
            } else {
                for (int i7 = 0; i7 < listZza2.size(); i7++) {
                    if (listZza2.get(i7).zzf().equals(this.zzb)) {
                        listZza2.get(i7).zza(this.zzc);
                        break;
                    }
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zzahkVar.zza(bool.booleanValue());
        } else {
            zzahkVar.zza(zzahkVar.zzb() - zzahkVar.zza() < 1000);
        }
        zzahkVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzahkVar);
    }
}
