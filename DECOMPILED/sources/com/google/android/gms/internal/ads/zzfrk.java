package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfrk extends zzfqy {
    private zzght<Integer> zza;
    private zzght<Integer> zzb;
    private zzfra zzc;
    private HttpURLConnection zzd;

    zzfrk(zzght<Integer> zzghtVar, zzght<Integer> zzghtVar2, zzfra zzfraVar) {
        this.zza = zzghtVar;
        this.zzb = zzghtVar2;
        this.zzc = zzfraVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzA() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzB() {
        return -1;
    }

    public static void zzi(HttpURLConnection httpURLConnection) {
        zzfqz.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ URLConnection zzy(URL url) {
        int i7 = zzfqt.zzb;
        return url.openConnection();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzi(this.zzd);
    }

    public URLConnection zzf(final URL url, final int i7) {
        this.zza = new zzght() { // from class: com.google.android.gms.internal.ads.zzfrc
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i7);
            }
        };
        this.zzc = new zzfra() { // from class: com.google.android.gms.internal.ads.zzfrd
            @Override // com.google.android.gms.internal.ads.zzfra
            public final /* synthetic */ URLConnection zza() {
                return zzfrk.zzy(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzg(final Network network, final URL url, final int i7, final int i8) {
        this.zza = new zzght() { // from class: com.google.android.gms.internal.ads.zzfre
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i7);
            }
        };
        this.zzb = new zzght() { // from class: com.google.android.gms.internal.ads.zzfrf
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i8);
            }
        };
        this.zzc = new zzfra() { // from class: com.google.android.gms.internal.ads.zzfrg
            @Override // com.google.android.gms.internal.ads.zzfra
            public final /* synthetic */ URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzh(zzfra zzfraVar, final int i7, final int i8) {
        this.zza = new zzght() { // from class: com.google.android.gms.internal.ads.zzfrh
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i7);
            }
        };
        this.zzb = new zzght() { // from class: com.google.android.gms.internal.ads.zzfri
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i8);
            }
        };
        this.zzc = zzfraVar;
        return zzj();
    }

    public HttpURLConnection zzj() {
        zzfqz.zza(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfra zzfraVar = this.zzc;
        zzfraVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfraVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    zzfrk() {
        this(zzfrj.zza, zzfrb.zza, null);
    }
}
