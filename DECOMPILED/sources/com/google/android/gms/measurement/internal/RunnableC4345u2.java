package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzcj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u2 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4345u2 implements Runnable {

    /* JADX INFO: renamed from: a */
    private final URL f16100a;

    /* JADX INFO: renamed from: b */
    private final byte[] f16101b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC4329s2 f16102c;

    /* JADX INFO: renamed from: d */
    private final String f16103d;

    /* JADX INFO: renamed from: e */
    private final Map f16104e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C4353v2 f16105f;

    public RunnableC4345u2(C4353v2 c4353v2, String str, URL url, byte[] bArr, Map map, InterfaceC4329s2 interfaceC4329s2) {
        Objects.requireNonNull(c4353v2);
        this.f16105f = c4353v2;
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(url);
        AbstractC3718s.m18083l(interfaceC4329s2);
        this.f16100a = url;
        this.f16101b = bArr;
        this.f16102c = interfaceC4329s2;
        this.f16103d = str;
        this.f16104e = map;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0143  */
    /* JADX WARN: Code duplicated, block: B:83:0x0180  */
    /* JADX WARN: Code duplicated, block: B:88:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fe: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:51:0x00fc */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0101: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:52:0x0100 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th;
        Map map3;
        Map map4;
        InputStream inputStream;
        C4353v2 c4353v2 = this.f16105f;
        c4353v2.mo18426g();
        int i7 = 0;
        OutputStream outputStream = null;
        try {
            URL url = this.f16100a;
            int i8 = zzcj.zzb;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            C4164X2 c4164x2 = c4353v2.f15066a;
            c4164x2.m18686w();
            httpURLConnection.setConnectTimeout(60000);
            c4164x2.m18686w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.f16104e;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.f16101b;
                if (bArr != null) {
                    byte[] bArrM19098V = c4353v2.f15465b.m18903K0().m19098V(bArr);
                    C4297o2 c4297o2M18859w = c4164x2.mo18421a().m18859w();
                    int length = bArrM19098V.length;
                    c4297o2M18859w.m18835b("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrM19098V);
                        outputStream2.close();
                    } catch (IOException e7) {
                        iOException = e7;
                        responseCode = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e8) {
                                this.f16105f.f15066a.mo18421a().m18851o().m18836c("Error closing HTTP compressed POST connection output stream. appId", C4313q2.m18846x(this.f16103d), e8);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f16105f.f15066a.mo18422b().m18639t(new RunnableC4337t2(this.f16103d, this.f16102c, responseCode, iOException, null, map2, null));
                    } catch (Throwable th2) {
                        th = th2;
                        map = null;
                        outputStream = outputStream2;
                        th = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e9) {
                                this.f16105f.f15066a.mo18421a().m18851o().m18836c("Error closing HTTP compressed POST connection output stream. appId", C4313q2.m18846x(this.f16103d), e9);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f16105f.f15066a.mo18422b().m18639t(new RunnableC4337t2(this.f16103d, this.f16102c, i7, null, null, map, null));
                        throw th;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i9 = inputStream.read(bArr2);
                                    if (i9 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        this.f16105f.f15066a.mo18422b().m18639t(new RunnableC4337t2(this.f16103d, this.f16102c, responseCode, null, byteArray, headerFields, null));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i9);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        map2 = null;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f16105f.f15066a.mo18422b().m18639t(new RunnableC4337t2(this.f16103d, this.f16102c, responseCode, iOException, null, map2, null));
                    } catch (Throwable th5) {
                        th = th5;
                        map = null;
                        i7 = responseCode;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f16105f.f15066a.mo18422b().m18639t(new RunnableC4337t2(this.f16103d, this.f16102c, i7, null, null, map, null));
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                    map2 = map4;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f16105f.f15066a.mo18422b().m18639t(new RunnableC4337t2(this.f16103d, this.f16102c, responseCode, iOException, null, map2, null));
                } catch (Throwable th6) {
                    th = th6;
                    i7 = responseCode;
                    map = map3;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f16105f.f15066a.mo18422b().m18639t(new RunnableC4337t2(this.f16103d, this.f16102c, i7, null, null, map, null));
                    throw th;
                }
            } catch (IOException e12) {
                iOException = e12;
                responseCode = 0;
                map2 = null;
            } catch (Throwable th7) {
                th = th7;
                map = null;
            }
        } catch (IOException e13) {
            iOException = e13;
            responseCode = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            map = null;
        }
    }
}
