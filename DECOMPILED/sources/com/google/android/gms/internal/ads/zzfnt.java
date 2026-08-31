package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfnt extends AsyncTask {
    private zzfnu zza;
    protected final zzfnl zzd;

    public zzfnt(zzfnl zzfnlVar) {
        this.zzd = zzfnlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfnu zzfnuVar = this.zza;
        if (zzfnuVar != null) {
            zzfnuVar.zzb(this);
        }
    }

    public final void zzb(zzfnu zzfnuVar) {
        this.zza = zzfnuVar;
    }
}
