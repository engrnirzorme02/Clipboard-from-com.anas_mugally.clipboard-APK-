package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3369m2;
import java.util.List;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeml implements zzeun {
    public final Context zza;
    public final C3369m2 zzb;
    public final List zzc;

    public zzeml(Context context, C3369m2 c3369m2, List list) {
        this.zza = context;
        this.zzb = c3369m2;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (((Boolean) zzbel.zza.zze()).booleanValue()) {
            Bundle bundle = new Bundle();
            C7351t.m32349g();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", className);
            Bundle bundle2 = new Bundle();
            C3369m2 c3369m2 = this.zzb;
            bundle2.putInt("width", c3369m2.f14026e);
            bundle2.putInt("height", c3369m2.f14023b);
            bundle.putBundle("size", bundle2);
            List list = this.zzc;
            if (!list.isEmpty()) {
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            zzcuuVar.zza.putBundle("view_hierarchy", bundle);
        }
    }
}
