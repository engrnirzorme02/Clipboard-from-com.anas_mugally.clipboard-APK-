package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdv extends zzfs implements zzgt {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgs zze;
    private zzge zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    zzcdv(String str, zzgy zzgyVar, int i7, int i8, long j7, long j8) {
        super(true);
        zzcu.zza(str);
        this.zzd = str;
        this.zze = new zzgs();
        this.zzb = i7;
        this.zzc = i8;
        this.zzh = new ArrayDeque();
        this.zzq = j7;
        this.zzr = j8;
        if (zzgyVar != null) {
            zze(zzgyVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Unexpected error while disconnecting", e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) throws zzgp {
        if (i8 == 0) {
            return 0;
        }
        try {
            long j7 = this.zzl;
            long j8 = this.zzm;
            if (j7 - j8 == 0) {
                return -1;
            }
            long j9 = this.zzn + j8;
            long j10 = i8;
            long j11 = this.zzr;
            long j12 = j9 + j10 + j11;
            long j13 = this.zzp;
            long j14 = j13 + 1;
            if (j12 > j14) {
                long j15 = this.zzo;
                if (j13 < j15) {
                    long jMin = Math.min(j15, Math.max(((this.zzq + j14) - j11) - 1, (j14 + j10) - 1));
                    zzk(j14, jMin, 2);
                    this.zzp = jMin;
                    j13 = jMin;
                }
            }
            int i9 = this.zzi.read(bArr, i7, (int) Math.min(j10, ((j13 + 1) - this.zzn) - this.zzm));
            if (i9 == -1) {
                throw new EOFException();
            }
            this.zzm += (long) i9;
            zzh(i9);
            return i9;
        } catch (IOException e7) {
            throw new zzgp(e7, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzgp {
        this.zzf = zzgeVar;
        this.zzm = 0L;
        long j7 = zzgeVar.zze;
        long j8 = zzgeVar.zzf;
        long jMin = j8 == -1 ? this.zzq : Math.min(this.zzq, j8);
        this.zzn = j7;
        HttpURLConnection httpURLConnectionZzk = zzk(j7, (jMin + j7) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j9 = Long.parseLong(matcher.group(2));
                    long j10 = Long.parseLong(matcher.group(3));
                    long j11 = zzgeVar.zzf;
                    if (j11 != -1) {
                        this.zzl = j11;
                        this.zzo = Math.max(j9, (this.zzn + j11) - 1);
                    } else {
                        this.zzl = j10 - this.zzn;
                        this.zzo = j10 - 1;
                    }
                    this.zzp = j9;
                    this.zzj = true;
                    zzg(zzgeVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb.append("Unexpected Content-Range [");
                    sb.append(headerField);
                    sb.append("]");
                    String string = sb.toString();
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33328c(string);
                }
            }
        }
        throw new zzcdt(headerField, zzgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    throw new zzgp(e7, this.zzf, 2000, 3);
                }
            }
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        } catch (Throwable th) {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final HttpURLConnection zzk(long j7, long j8, int i7) throws zzgp {
        IOException iOException;
        String string = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e7) {
                    iOException = e7;
                    String strValueOf = String.valueOf(string);
                    throw new zzgp("Unable to connect to ".concat(strValueOf), iOException, this.zzf, 2000, i7);
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 7 + String.valueOf(j8).length());
            sb.append("bytes=");
            sb.append(j7);
            sb.append("-");
            sb.append(j8);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzcdu(this.zzk, headerFields, this.zzf, i7);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e8) {
                    zzl();
                    throw new zzgp(e8, this.zzf, 2000, i7);
                }
            } catch (IOException e9) {
                zzl();
                String strValueOf2 = String.valueOf(string2);
                throw new zzgp("Unable to connect to ".concat(strValueOf2), e9, this.zzf, 2000, i7);
            }
        } catch (IOException e10) {
            iOException = e10;
        }
    }
}
