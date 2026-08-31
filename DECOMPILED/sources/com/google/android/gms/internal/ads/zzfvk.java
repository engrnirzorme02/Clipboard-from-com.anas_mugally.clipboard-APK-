package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.AbstractC2405c;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfvk implements zzfve {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzfvk(ExecutorService executorService, String str, long j7) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j7;
    }

    private final /* synthetic */ void zzd(String str, AbstractC2405c.a aVar, boolean z7, String str2, byte[] bArr) {
        Throwable th;
        SocketTimeoutException e7;
        final HttpURLConnection httpURLConnection;
        byte[] byteArray;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
                try {
                    Objects.requireNonNull(httpURLConnection);
                    aVar.m10342a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            httpURLConnection.disconnect();
                        }
                    }, this.zza);
                    httpURLConnection.setRequestProperty("User-Agent", this.zzb);
                    int i7 = (int) this.zzc;
                    httpURLConnection.setConnectTimeout(i7);
                    httpURLConnection.setReadTimeout(i7);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    try {
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                if (inputStream == null) {
                                    byteArray = new byte[0];
                                    byteArrayOutputStream.close();
                                } else {
                                    byte[] bArr2 = new byte[4096];
                                    while (true) {
                                        int i8 = inputStream.read(bArr2);
                                        if (i8 == -1) {
                                            break;
                                        } else {
                                            byteArrayOutputStream.write(bArr2, 0, i8);
                                        }
                                    }
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    inputStream.close();
                                }
                                aVar.m10344c(new zzfvj(responseCode, byteArray));
                            } catch (Throwable th2) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                } catch (SocketTimeoutException e8) {
                    e7 = e8;
                    httpURLConnection2 = httpURLConnection;
                    String message = e7.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 9);
                    sb.append("Timeout: ");
                    sb.append(message);
                    aVar.m10346f(new TimeoutException(sb.toString()));
                    httpURLConnection = httpURLConnection2;
                } catch (Throwable th8) {
                    th = th8;
                    httpURLConnection2 = httpURLConnection;
                    aVar.m10346f(th);
                    httpURLConnection = httpURLConnection2;
                }
            } catch (Throwable th9) {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th9;
            }
        } catch (SocketTimeoutException e9) {
            e7 = e9;
        } catch (Throwable th10) {
            th = th10;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final InterfaceFutureC1673e zza(final String str, final byte[] bArr, String str2) {
        final boolean z7 = true;
        final String str3 = "application/x-protobuf";
        return AbstractC2405c.m10340a(new AbstractC2405c.c(str, z7, str3, bArr) { // from class: com.google.android.gms.internal.ads.zzfvh
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzc = "application/x-protobuf";
            private final /* synthetic */ byte[] zzd;

            {
                this.zzd = bArr;
            }

            @Override // androidx.concurrent.futures.AbstractC2405c.c
            public final /* synthetic */ Object attachCompleter(AbstractC2405c.a aVar) {
                return this.zza.zzb(this.zzb, true, this.zzc, this.zzd, aVar);
            }
        });
    }

    final /* synthetic */ Object zzb(final String str, boolean z7, String str2, final byte[] bArr, final AbstractC2405c.a aVar) {
        final boolean z8 = true;
        final String str3 = "application/x-protobuf";
        this.zza.execute(new Runnable(str, aVar, z8, str3, bArr) { // from class: com.google.android.gms.internal.ads.zzfvg
            private final /* synthetic */ String zzb;
            private final /* synthetic */ AbstractC2405c.a zzc;
            private final /* synthetic */ String zzd = "application/x-protobuf";
            private final /* synthetic */ byte[] zze;

            {
                this.zze = bArr;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(this.zzb, this.zzc, true, this.zzd, this.zze);
            }
        });
        return "";
    }

    final /* synthetic */ void zzc(String str, AbstractC2405c.a aVar, boolean z7, String str2, byte[] bArr) {
        zzd(str, aVar, true, "application/x-protobuf", bArr);
    }
}
