package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgl extends zzfs implements zzgt {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgs zze;
    private final zzgs zzf;
    private zzge zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzgl(String str, int i7, int i8, boolean z7, boolean z8, zzgs zzgsVar, zzghd zzghdVar, boolean z9, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i7;
        this.zzc = i8;
        this.zza = z7;
        this.zze = zzgsVar;
        this.zzf = new zzgs();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    private final HttpURLConnection zzk(URL url, int i7, byte[] bArr, long j7, long j8, boolean z7, boolean z8, Map map) throws IOException {
        StringBuilder sb;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap map2 = new HashMap();
        map2.putAll(this.zze.zza());
        map2.putAll(this.zzf.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j7 != 0) {
            sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j7);
            sb.append("-");
            if (j8 != -1) {
                sb.append((j7 + j8) - 1);
            }
            string = sb.toString();
        } else if (j8 == -1) {
            string = null;
        } else {
            j7 = 0;
            sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j7);
            sb.append("-");
            if (j8 != -1) {
                sb.append((j7 + j8) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.zzd;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z7 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z8);
        httpURLConnection.setDoOutput(false);
        int i8 = zzge.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzge zzgeVar) throws zzgp {
        if (str == null) {
            throw new zzgp("Null location redirect", zzgeVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzgp("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzgeVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 40 + protocol.length() + 1);
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzgp(sb.toString(), zzgeVar, 2001, 1);
        } catch (MalformedURLException e7) {
            throw new zzgp(e7, zzgeVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                zzds.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
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
            if (j7 != -1) {
                long j8 = j7 - this.zzm;
                if (j8 == 0) {
                    return -1;
                }
                i8 = (int) Math.min(i8, j8);
            }
            InputStream inputStream = this.zzi;
            String str = zzeo.zza;
            int i9 = inputStream.read(bArr, i7, i8);
            if (i9 == -1) {
                return -1;
            }
            this.zzm += (long) i9;
            zzh(i9);
            return i9;
        } catch (IOException e7) {
            zzge zzgeVar = this.zzg;
            String str2 = zzeo.zza;
            throw zzgp.zza(e7, zzgeVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzgp {
        zzgl zzglVar;
        long j7;
        int i7;
        HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZza;
        long j8;
        zzgl zzglVar2 = this;
        zzglVar2.zzg = zzgeVar;
        long j9 = 0;
        zzglVar2.zzm = 0L;
        zzglVar2.zzl = 0L;
        zzf(zzgeVar);
        try {
            URL url = new URL(zzgeVar.zza.toString());
            long j10 = zzgeVar.zze;
            long j11 = zzgeVar.zzf;
            boolean zZza = zzgeVar.zza(1);
            int i8 = 0;
            try {
                if (zzglVar2.zza) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i8 + 1;
                        if (i8 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i10);
                            throw new zzgp(new NoRouteToHostException(sb.toString()), zzgeVar, 2001, 1);
                        }
                        j7 = j9;
                        i7 = i9;
                        zzglVar2 = this;
                        HttpURLConnection httpURLConnectionZzk2 = zzglVar2.zzk(url, 1, null, j10, j11, zZza, false, zzgeVar.zzd);
                        URL url2 = url;
                        long j12 = j11;
                        zzglVar = zzglVar2;
                        try {
                            int responseCode = httpURLConnectionZzk2.getResponseCode();
                            String headerField = httpURLConnectionZzk2.getHeaderField("Location");
                            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                httpURLConnectionZzk = httpURLConnectionZzk2;
                                break;
                            }
                            httpURLConnectionZzk2.disconnect();
                            URL urlZzl = zzglVar.zzl(url2, headerField, zzgeVar);
                            j11 = j12;
                            url = urlZzl;
                            i9 = i7;
                            i8 = i10;
                            j9 = j7;
                        } catch (IOException e7) {
                            e = e7;
                        }
                        zzglVar.zzm();
                        throw zzgp.zza(e, zzgeVar, 1);
                    }
                }
                httpURLConnectionZzk = zzglVar2.zzk(url, 1, null, j10, j11, zZza, true, zzgeVar.zzd);
                zzglVar = this;
                j7 = 0;
                i7 = 0;
                zzglVar.zzh = httpURLConnectionZzk;
                zzglVar.zzk = httpURLConnectionZzk.getResponseCode();
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i11 = zzglVar.zzk;
                if (i11 < 200 || i11 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (zzglVar.zzk == 416) {
                        if (zzgeVar.zze == zzgu.zza(httpURLConnectionZzk.getHeaderField("Content-Range"))) {
                            zzglVar.zzj = true;
                            zzg(zzgeVar);
                            long j13 = zzgeVar.zzf;
                            return j13 != -1 ? j13 : j7;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        bArrZza = errorStream != null ? zzgmo.zza(errorStream) : zzeo.zzb;
                    } catch (IOException unused) {
                        bArrZza = zzeo.zzb;
                    }
                    zzglVar.zzm();
                    throw new zzgr(zzglVar.zzk, responseMessage, zzglVar.zzk == 416 ? new zzgb(2008) : null, headerFields, zzgeVar, bArrZza);
                }
                httpURLConnectionZzk.getContentType();
                if (zzglVar.zzk == 200) {
                    j8 = zzgeVar.zze;
                    if (j8 == j7) {
                        j8 = j7;
                    }
                } else {
                    j8 = j7;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    zzglVar.zzl = zzgeVar.zzf;
                } else {
                    long j14 = zzgeVar.zzf;
                    if (j14 != -1) {
                        zzglVar.zzl = j14;
                    } else {
                        long jZzb = zzgu.zzb(httpURLConnectionZzk.getHeaderField("Content-Length"), httpURLConnectionZzk.getHeaderField("Content-Range"));
                        zzglVar.zzl = jZzb != -1 ? jZzb - j8 : -1L;
                    }
                }
                try {
                    zzglVar.zzi = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        zzglVar.zzi = new GZIPInputStream(zzglVar.zzi);
                    }
                    zzglVar.zzj = true;
                    zzg(zzgeVar);
                    if (j8 != j7) {
                        try {
                            byte[] bArr = new byte[4096];
                            while (j8 > j7) {
                                int iMin = (int) Math.min(j8, 4096L);
                                InputStream inputStream = zzglVar.zzi;
                                String str = zzeo.zza;
                                int i12 = inputStream.read(bArr, i7, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzgp(new InterruptedIOException(), zzgeVar, 2000, 1);
                                }
                                if (i12 == -1) {
                                    throw new zzgp(zzgeVar, 2008, 1);
                                }
                                j8 -= (long) i12;
                                zzglVar.zzh(i12);
                            }
                        } catch (IOException e8) {
                            zzglVar.zzm();
                            if (e8 instanceof zzgp) {
                                throw ((zzgp) e8);
                            }
                            throw new zzgp(e8, zzgeVar, 2000, 1);
                        }
                    }
                    return zzglVar.zzl;
                } catch (IOException e9) {
                    zzglVar.zzm();
                    throw new zzgp(e9, zzgeVar, 2000, 1);
                }
            } catch (IOException e10) {
                e = e10;
                zzglVar = this;
            }
        } catch (IOException e11) {
            e = e11;
            zzglVar = zzglVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzge zzgeVar = this.zzg;
        if (zzgeVar != null) {
            return zzgeVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    zzge zzgeVar = this.zzg;
                    String str = zzeo.zza;
                    throw new zzgp(e7, zzgeVar, 2000, 3);
                }
            }
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
        } catch (Throwable th) {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgkc.zza() : new zzgk(httpURLConnection.getHeaderFields());
    }
}
