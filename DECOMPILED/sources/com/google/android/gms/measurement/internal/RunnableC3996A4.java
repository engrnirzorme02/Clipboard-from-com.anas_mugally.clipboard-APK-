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
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.A4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC3996A4 implements Runnable {

    /* JADX INFO: renamed from: a */
    private final URL f15067a;

    /* JADX INFO: renamed from: b */
    private final byte[] f15068b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC4379y4 f15069c;

    /* JADX INFO: renamed from: d */
    private final String f15070d;

    /* JADX INFO: renamed from: e */
    private final Map f15071e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C4004B4 f15072f;

    public RunnableC3996A4(C4004B4 c4004b4, String str, URL url, byte[] bArr, Map map, InterfaceC4379y4 interfaceC4379y4) {
        Objects.requireNonNull(c4004b4);
        this.f15072f = c4004b4;
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(url);
        AbstractC3718s.m18083l(interfaceC4379y4);
        this.f15067a = url;
        this.f15068b = bArr;
        this.f15069c = interfaceC4379y4;
        this.f15070d = str;
        this.f15071e = map;
    }

    /* JADX INFO: renamed from: b */
    private final void m18428b(final int i7, final Exception exc, final byte[] bArr, final Map map) {
        this.f15072f.f15066a.mo18422b().m18639t(new Runnable() { // from class: com.google.android.gms.measurement.internal.z4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f16266a.m18429a(i7, exc, bArr, map);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ void m18429a(int i7, Exception exc, byte[] bArr, Map map) {
        this.f15069c.mo18652a(this.f15070d, i7, exc, bArr, map);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0151  */
    /* JADX WARN: Code duplicated, block: B:87:0x0179  */
    /* JADX WARN: Code duplicated, block: B:90:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.A4] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        ?? r7;
        OutputStream outputStream3;
        ?? r8;
        OutputStream outputStream4;
        InputStream inputStream;
        C4004B4 c4004b4 = this.f15072f;
        c4004b4.mo18426g();
        int i7 = 0;
        try {
            URL url = this.f15067a;
            int i8 = zzcj.zzb;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            C4164X2 c4164x2 = c4004b4.f15066a;
            c4164x2.m18686w();
            httpURLConnection.setConnectTimeout(60000);
            c4164x2.m18686w();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r9 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.f15071e;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.f15068b;
                    if (bArr != null) {
                        try {
                            c4164x2.mo18423c();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            C4297o2 c4297o2M18859w = this.f15072f.f15066a.mo18421a().m18859w();
                            int length = byteArray.length;
                            c4297o2M18859w.m18835b("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream5 = httpURLConnection.getOutputStream();
                            try {
                                outputStream5.write(byteArray);
                                outputStream5.close();
                                r9 = outputStream5;
                            } catch (IOException e7) {
                                e = e7;
                                r8 = 0;
                                outputStream4 = outputStream5;
                                if (outputStream4 != null) {
                                    try {
                                        outputStream4.close();
                                    } catch (IOException e8) {
                                        this.f15072f.f15066a.mo18421a().m18851o().m18836c("Error closing HTTP compressed POST connection output stream. appId", C4313q2.m18846x(this.f15070d), e8);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                m18428b(i7, e, null, r8);
                            } catch (Throwable th) {
                                th = th;
                                r7 = 0;
                                outputStream3 = outputStream5;
                                if (outputStream3 != null) {
                                    try {
                                        outputStream3.close();
                                    } catch (IOException e9) {
                                        this.f15072f.f15066a.mo18421a().m18851o().m18836c("Error closing HTTP compressed POST connection output stream. appId", C4313q2.m18846x(this.f15070d), e9);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                m18428b(i7, null, null, r7);
                                throw th;
                            }
                        } catch (IOException e10) {
                            this.f15072f.f15066a.mo18421a().m18851o().m18835b("Failed to gzip post request content", e10);
                            throw e10;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i9 = inputStream.read(bArr2);
                                        if (i9 <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            m18428b(responseCode, null, byteArray2, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream2.write(bArr2, 0, i9);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = null;
                            }
                        } catch (IOException e11) {
                            i7 = responseCode;
                            e = e11;
                            outputStream2 = null;
                            r8 = outputStream2;
                            outputStream4 = outputStream2;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m18428b(i7, e, null, r8);
                        } catch (Throwable th4) {
                            i7 = responseCode;
                            th = th4;
                            outputStream = null;
                            r7 = outputStream;
                            outputStream3 = outputStream;
                            if (outputStream3 != null) {
                                outputStream3.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            m18428b(i7, null, null, r7);
                            throw th;
                        }
                    } catch (IOException e12) {
                        i7 = responseCode;
                        e = e12;
                        r8 = r9;
                        outputStream4 = null;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m18428b(i7, e, null, r8);
                    } catch (Throwable th5) {
                        i7 = responseCode;
                        th = th5;
                        r7 = r9;
                        outputStream3 = null;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m18428b(i7, null, null, r7);
                        throw th;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (IOException e14) {
            e = e14;
            httpURLConnection = null;
            outputStream2 = null;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
            outputStream = null;
        }
    }
}
