package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Arrays;
import p404z2.C7584a;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgu implements zzaup {
    private final Context zza;
    private final zzfue zzb;

    zzcgu(Context context, C7584a c7584a) {
        this.zza = context;
        int iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzdc)).intValue();
        int i7 = 2;
        if (iIntValue != 1) {
            i7 = (iIntValue == 2 || iIntValue != 3) ? 3 : 4;
        }
        zzfuw zzfuwVarZze = zzfux.zze();
        zzfuwVarZze.zza(((Float) C3250D.m17200c().zzd(zzbci.zzdj)).floatValue());
        zzfux zzfuxVar = (zzfux) zzfuwVarZze.zzbu();
        zzfuy zzfuyVarZzg = zzfuz.zzg();
        zzfuyVarZzg.zza(((Boolean) C3250D.m17200c().zzd(zzbci.zzdk)).booleanValue());
        zzfuz zzfuzVar = (zzfuz) zzfuyVarZzg.zzbu();
        zzfuh zzfuhVarZzs = zzfui.zzs();
        zzfuhVarZzs.zzi(i7);
        zzfuhVarZzs.zzb(c7584a.f30226a);
        zzfuhVarZzs.zza(((Boolean) C3250D.m17200c().zzd(zzbci.zzcG)).booleanValue());
        zzfuhVarZzs.zzh(((Integer) C3250D.m17200c().zzd(zzbci.zzcZ)).intValue() == -1);
        zzfuhVarZzs.zzg(((Integer) C3250D.m17200c().zzd(zzbci.zzdb)).intValue());
        zzfuhVarZzs.zze(((Long) C3250D.m17200c().zzd(zzbci.zzdl)).longValue());
        zzfuhVarZzs.zzd(((Integer) C3250D.m17200c().zzd(zzbci.zzda)).intValue());
        zzfuhVarZzs.zzc(zzfuxVar);
        zzfuhVarZzs.zzf(zzfuzVar);
        zzfue zzfueVarZza = zzfue.zza(context, zzbzh.zza, (zzfui) zzfuhVarZzs.zzbu());
        this.zzb = zzfueVarZza;
        zzfueVarZza.zzb();
    }

    public final String zza() {
        int iZzh = this.zzb.zzh() - 1;
        if (iZzh != 1) {
            return iZzh != 2 ? "uns" : "2.0";
        }
        return "1.0";
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.zzb.zzg(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    @Deprecated
    public final void zze(int i7, int i8, int i9) {
        C3244B.m17190a();
        Context context = this.zza;
        float fM33276c = C7590g.m33276c(context, i7);
        C3244B.m17190a();
        float fM33276c2 = C7590g.m33276c(context, i8);
        zzfue zzfueVar = this.zzb;
        long j7 = i9;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j7, 0, fM33276c, fM33276c2, 0);
        zzfueVar.zzg(motionEventObtain);
        motionEventObtain.recycle();
        C3244B.m17190a();
        float fM33276c3 = C7590g.m33276c(context, i7);
        C3244B.m17190a();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j7, 2, fM33276c3, C7590g.m33276c(context, i8), 0);
        zzfueVar.zzg(motionEventObtain2);
        motionEventObtain2.recycle();
        C3244B.m17190a();
        float fM33276c4 = C7590g.m33276c(context, i7);
        C3244B.m17190a();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j7, 1, fM33276c4, C7590g.m33276c(context, i8), 0);
        zzfueVar.zzg(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzg(Context context, String str, View view) {
        return this.zzb.zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzb.zzf(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzj(Context context, View view, Activity activity) {
        return this.zzb.zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzk(Context context) {
        return this.zzb.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzl(Context context) {
        return this.zzb.zzc(context);
    }
}
