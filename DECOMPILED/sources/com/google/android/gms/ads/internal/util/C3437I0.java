package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcev;
import com.google.android.gms.internal.ads.zzcfz;
import com.google.android.gms.internal.ads.zzecy;
import p380w2.C7351t;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.I0 */
/* JADX INFO: loaded from: classes.dex */
public class C3437I0 extends AbstractC3435H0 {
    @Override // com.google.android.gms.ads.internal.util.AbstractC3451P0
    /* JADX INFO: renamed from: b */
    public final zzcev mo17459b(zzcek zzcekVar, zzbbh zzbbhVar, boolean z7, zzecy zzecyVar) {
        return new zzcfz(zzcekVar, zzbbhVar, z7, zzecyVar);
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3451P0
    /* JADX INFO: renamed from: e */
    public final zzbbn.zzq mo17460e(Context context, TelephonyManager telephonyManager) {
        C7351t.m32349g();
        if (C3431F0.m17408e(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) {
            return zzbbn.zzq.ENUM_TRUE;
        }
        return zzbbn.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3451P0
    /* JADX INFO: renamed from: f */
    public final void mo17461f(Context context, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", ((Integer) C3250D.m17200c().zzd(zzbci.zzjl)).intValue());
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3451P0
    /* JADX INFO: renamed from: g */
    public final boolean mo17462g(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3451P0
    /* JADX INFO: renamed from: h */
    public final Intent mo17463h(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
