package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzazm {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        try {
            this.zzb.close();
        } catch (IOException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("HashManager: Unable to convert to Base64.", e7);
        }
        try {
            try {
                this.zza.close();
                string = this.zza.toString();
            } catch (IOException e8) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("HashManager: Unable to convert to Base64.", e8);
                string = "";
            }
            return string;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
