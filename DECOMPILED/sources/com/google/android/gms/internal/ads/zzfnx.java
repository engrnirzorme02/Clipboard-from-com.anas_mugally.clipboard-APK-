package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfnx extends zzfns {
    public zzfnx(zzfnl zzfnlVar, HashSet hashSet, JSONObject jSONObject, long j7) {
        super(zzfnlVar, hashSet, jSONObject, j7);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfnl zzfnlVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfnd.zzg(jSONObject, zzfnlVar.zzd())) {
            return null;
        }
        zzfnlVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnt, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfnt
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzfmh zzfmhVarZza;
        if (!TextUtils.isEmpty(str) && (zzfmhVarZza = zzfmh.zza()) != null) {
            for (zzfln zzflnVar : zzfmhVarZza.zze()) {
                if (((zzfns) this).zza.contains(zzflnVar.zzh())) {
                    zzflnVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
