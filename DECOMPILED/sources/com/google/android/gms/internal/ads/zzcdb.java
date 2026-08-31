package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdb extends zzfs implements zzgt {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgs zzg;
    private zzge zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    zzcdb(String str, zzgy zzgyVar, int i7, int i8, int i9) {
        super(true);
        this.zzc = new zzcda(this);
        this.zzr = new HashSet();
        zzcu.zza(str);
        this.zzf = str;
        this.zzg = new zzgs();
        this.zzd = i7;
        this.zze = i8;
        this.zzq = i9;
        if (zzgyVar != null) {
            zze(zzgyVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Unexpected error while disconnecting", e7);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) throws zzgp {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j7 = this.zzo;
                    long j8 = this.zzm;
                    if (j7 == j8) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i9 = this.zzj.read(bArr2, 0, (int) Math.min(j8 - j7, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i9 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long) i9;
                    zzh(i9);
                }
            }
            if (i8 == 0) {
                return 0;
            }
            long j9 = this.zzn;
            if (j9 != -1) {
                long j10 = j9 - this.zzp;
                if (j10 == 0) {
                    return -1;
                }
                i8 = (int) Math.min(i8, j10);
            }
            int i10 = this.zzj.read(bArr, i7, i8);
            if (i10 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += (long) i10;
            zzh(i10);
            return i10;
        } catch (IOException e7) {
            throw new zzgp(e7, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ea A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0048, B:12:0x0060, B:14:0x0066, B:22:0x0094, B:24:0x00b6, B:26:0x00dc, B:27:0x00e1, B:29:0x00ea, B:30:0x00f1, B:43:0x011a, B:96:0x028d, B:98:0x029a, B:100:0x02ab, B:103:0x02b4, B:104:0x02c1, B:106:0x02cb, B:107:0x02d2, B:108:0x02d3, B:109:0x02f0), top: B:116:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Code duplicated, block: B:98:0x029a A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0048, B:12:0x0060, B:14:0x0066, B:22:0x0094, B:24:0x00b6, B:26:0x00dc, B:27:0x00e1, B:29:0x00ea, B:30:0x00f1, B:43:0x011a, B:96:0x028d, B:98:0x029a, B:100:0x02ab, B:103:0x02b4, B:104:0x02c1, B:106:0x02cb, B:107:0x02d2, B:108:0x02d3, B:109:0x02f0), top: B:116:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzgp {
        long j7;
        int responseCode;
        String headerField;
        String protocol;
        long j8;
        long jMax;
        this.zzh = zzgeVar;
        long j9 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzgeVar.zza.toString());
            long j10 = zzgeVar.zze;
            long j11 = zzgeVar.zzf;
            boolean zZza = zzgeVar.zza(1);
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                long j12 = j9;
                if (i7 > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i8);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Iterator it = this.zzg.zza().entrySet().iterator(); it.hasNext(); it = it) {
                    Map.Entry entry = (Map.Entry) it.next();
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j10 == j12) {
                    if (j11 != -1) {
                        j7 = j12;
                    } else {
                        j10 = j10;
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                    if (!zZza) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            int responseCode2 = httpURLConnection.getResponseCode();
                            this.zzl = responseCode2;
                            if (responseCode2 < 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzgr zzgrVar = new zzgr(this.zzl, null, null, headerFields, zzgeVar, zzeo.zzb);
                                if (this.zzl != 416) {
                                    throw zzgrVar;
                                }
                                zzgrVar.initCause(new zzgb(2008));
                                throw zzgrVar;
                            }
                            if (responseCode2 == 200) {
                                j8 = zzgeVar.zze;
                                if (j8 == j12) {
                                    j8 = j12;
                                }
                            } else {
                                j8 = j12;
                            }
                            this.zzm = j8;
                            if (zzgeVar.zza(1)) {
                                this.zzn = zzgeVar.zzf;
                            } else {
                                long j13 = zzgeVar.zzf;
                                if (j13 != -1) {
                                    this.zzn = j13;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                    if (TextUtils.isEmpty(headerField2)) {
                                        jMax = -1;
                                    } else {
                                        try {
                                            jMax = Long.parseLong(headerField2);
                                        } catch (NumberFormatException unused) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField2).length() + 28);
                                            sb2.append("Unexpected Content-Length [");
                                            sb2.append(headerField2);
                                            sb2.append("]");
                                            String string = sb2.toString();
                                            int i9 = AbstractC3490o0.f14278b;
                                            AbstractC7599p.m33328c(string);
                                            jMax = -1;
                                        }
                                    }
                                    String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        Matcher matcher = zza.matcher(headerField3);
                                        if (matcher.find()) {
                                            try {
                                                long j14 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (jMax < j12) {
                                                    jMax = j14;
                                                } else if (jMax != j14) {
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(headerField2).length() + 25 + String.valueOf(headerField3).length() + 1);
                                                    sb3.append("Inconsistent headers [");
                                                    sb3.append(headerField2);
                                                    sb3.append("] [");
                                                    sb3.append(headerField3);
                                                    sb3.append("]");
                                                    String string2 = sb3.toString();
                                                    int i10 = AbstractC3490o0.f14278b;
                                                    AbstractC7599p.m33331f(string2);
                                                    jMax = Math.max(jMax, j14);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(headerField3).length() + 27);
                                                sb4.append("Unexpected Content-Range [");
                                                sb4.append(headerField3);
                                                sb4.append("]");
                                                String string3 = sb4.toString();
                                                int i11 = AbstractC3490o0.f14278b;
                                                AbstractC7599p.m33328c(string3);
                                            }
                                        }
                                    }
                                    this.zzn = jMax != -1 ? jMax - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = this.zzi.getInputStream();
                                this.zzk = true;
                                zzg(zzgeVar);
                                return this.zzn;
                            } catch (IOException e7) {
                                zzn();
                                throw new zzgp(e7, zzgeVar, 2000, 1);
                            }
                        } catch (IOException e8) {
                            zzn();
                            throw new zzgp("Unable to connect to ".concat(String.valueOf(zzgeVar.zza.toString())), e8, zzgeVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i7 = i8;
                    j9 = j12;
                    j10 = j10;
                } else {
                    j7 = j10;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j7).length() + 7);
                sb5.append("bytes=");
                long j15 = j7;
                sb5.append(j15);
                sb5.append("-");
                String string4 = sb5.toString();
                if (j11 != -1) {
                    long j16 = (j15 + j11) - 1;
                    StringBuilder sb6 = new StringBuilder(string4.length() + String.valueOf(j16).length());
                    sb6.append(string4);
                    sb6.append(j16);
                    string4 = sb6.toString();
                }
                httpURLConnection.setRequestProperty("Range", string4);
                httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                if (!zZza) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 300) {
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i7 = i8;
                j9 = j12;
                j10 = j10;
            }
        } catch (IOException e9) {
            throw new zzgp("Unable to connect to ".concat(String.valueOf(zzgeVar.zza.toString())), e9, zzgeVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                String str = zzeo.zza;
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    throw new zzgp(e7, this.zzh, 2000, 3);
                }
            }
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        } catch (Throwable th) {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzk(int i7) {
        this.zzq = i7;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e7) {
                    int i8 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33332g("Failed to update receive buffer size.", e7);
                }
            }
        }
    }

    final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    final /* synthetic */ int zzm() {
        return this.zzq;
    }
}
