package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3430F;
import com.google.android.gms.ads.internal.util.C3432G;
import com.google.android.gms.ads.internal.util.C3434H;
import java.util.concurrent.TimeUnit;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbe {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final C7584a zzd;
    private final zzbcu zze;
    private final zzbcx zzf;
    private final C3434H zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcaj zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = C3244B.m17194e().nextInt(100) < ((Integer) C3250D.m17200c().zzd(zzbci.zzny)).intValue();
    }

    public zzcbe(Context context, C7584a c7584a, String str, zzbcx zzbcxVar, zzbcu zzbcuVar) {
        C3432G c3432g = new C3432G();
        c3432g.m17447a("min_1", Double.MIN_VALUE, 1.0d);
        c3432g.m17447a("1_5", 1.0d, 5.0d);
        c3432g.m17447a("5_10", 5.0d, 10.0d);
        c3432g.m17447a("10_20", 10.0d, 20.0d);
        c3432g.m17447a("20_30", 20.0d, 30.0d);
        c3432g.m17447a("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = c3432g.m17448b();
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = c7584a;
        this.zzc = str;
        this.zzf = zzbcxVar;
        this.zze = zzbcuVar;
        String str2 = (String) C3250D.m17200c().zzd(zzbci.zzT);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i7 = 0; i7 < strArrSplit.length; i7++) {
            try {
                this.zzh[i7] = Long.parseLong(strArrSplit[i7]);
            } catch (NumberFormatException e7) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("Unable to parse frame hash target time number.", e7);
                this.zzh[i7] = -1;
            }
        }
    }

    public final void zza(zzcaj zzcajVar) {
        zzbcx zzbcxVar = this.zzf;
        zzbcp.zza(zzbcxVar, this.zze, "vpc2");
        this.zzj = true;
        zzbcxVar.zzd("vpn", zzcajVar.zza());
        this.zzo = zzcajVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbcp.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        if (!zza || this.zzp) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzc);
        bundle.putString("player", this.zzo.zza());
        for (C3430F c3430f : this.zzg.m17456b()) {
            String str = c3430f.f14175a;
            String strValueOf = String.valueOf(str);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(c3430f.f14179e));
            String strValueOf2 = String.valueOf(str);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(c3430f.f14178d));
        }
        int i7 = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i7 >= jArr.length) {
                C7351t.m32349g().m17441Q(this.zzb, this.zzd.f30226a, "gmob-apps", bundle, true);
                this.zzp = true;
                return;
            }
            String str2 = this.zzi[i7];
            if (str2 != null) {
                Long lValueOf = Long.valueOf(jArr[i7]);
                new StringBuilder(lValueOf.toString().length() + 3);
                bundle.putString("fh_".concat(lValueOf.toString()), str2);
            }
            i7++;
        }
    }

    public final void zzd(zzcaj zzcajVar) {
        if (this.zzl && !this.zzm) {
            if (AbstractC3490o0.m17547m() && !this.zzm) {
                AbstractC3490o0.m17545k("VideoMetricsMixin first frame");
            }
            zzbcp.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        long jMo18160b = C7351t.m32357o().mo18160b();
        if (this.zzn && this.zzq && this.zzr != -1) {
            this.zzg.m17455a(TimeUnit.SECONDS.toNanos(1L) / (jMo18160b - this.zzr));
        }
        this.zzq = this.zzn;
        this.zzr = jMo18160b;
        long jLongValue = ((Long) C3250D.m17200c().zzd(zzbci.zzU)).longValue();
        long jZzh = zzcajVar.zzh();
        int i7 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i7 >= strArr.length) {
                return;
            }
            if (strArr[i7] == null && jLongValue > Math.abs(jZzh - this.zzh[i7])) {
                int i8 = 8;
                Bitmap bitmap = zzcajVar.getBitmap(8, 8);
                long j7 = 63;
                long j8 = 0;
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = 0;
                    while (i10 < i8) {
                        int pixel = bitmap.getPixel(i10, i9);
                        j8 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j7);
                        j7--;
                        i10++;
                        i8 = 8;
                    }
                    i9++;
                    i8 = 8;
                }
                strArr[i7] = String.format("%016X", Long.valueOf(j8));
                return;
            }
            i7++;
        }
    }

    public final void zze() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        zzbcp.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzf() {
        this.zzn = false;
    }
}
