package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfnw extends zzfns {
    public zzfnw(zzfnl zzfnlVar, HashSet hashSet, JSONObject jSONObject, long j7) {
        super(zzfnlVar, hashSet, jSONObject, j7);
    }

    private final void zzc(String str) {
        zzfmh zzfmhVarZza = zzfmh.zza();
        if (zzfmhVarZza != null) {
            for (zzfln zzflnVar : zzfmhVarZza.zze()) {
                if (((zzfns) this).zza.contains(zzflnVar.zzh())) {
                    zzflnVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnt, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfnt
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
