package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3446N;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdli {
    private final C3446N zza;
    private final InterfaceC3750e zzb;
    private final Executor zzc;

    public zzdli(C3446N c3446n, InterfaceC3750e interfaceC3750e, Executor executor) {
        this.zza = c3446n;
        this.zzb = interfaceC3750e;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        InterfaceC3750e interfaceC3750e = this.zzb;
        long jMo18161c = interfaceC3750e.mo18161c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jMo18161c2 = interfaceC3750e.mo18161c();
        if (bitmapDecodeByteArray != null) {
            long j7 = jMo18161c2 - jMo18161c;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z7 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + String.valueOf(j7).length() + 15 + String.valueOf(z7).length());
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j7);
            sb.append(" on ui thread: ");
            sb.append(z7);
            AbstractC3490o0.m17545k(sb.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final InterfaceFutureC1673e zza(String str, final double d7, final boolean z7) {
        return zzgot.zzk(this.zza.m17467a(str), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdlh
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb(d7, z7, (zzapd) obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ Bitmap zzb(double d7, boolean z7, zzapd zzapdVar) {
        byte[] bArr = zzapdVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d7 * 160.0d);
        if (!z7) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgC)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i7 = options.outWidth * options.outHeight;
            if (i7 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i7 - 1) / ((Integer) C3250D.m17200c().zzd(zzbci.zzgD)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }
}
