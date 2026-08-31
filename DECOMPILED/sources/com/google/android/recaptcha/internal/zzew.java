package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.AbstractC6118n;
import p220c6.AbstractC3025a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzew {
    private final HttpURLConnection zza;

    public zzew(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() throws zzbd {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e7) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e7.getMessage());
        } catch (IOException e8) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e8.getMessage());
        } catch (Exception e9) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e9.getMessage());
        }
    }

    private final OutputStream zzg() throws zzbd {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e7) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e7.getMessage());
        } catch (IOException e8) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e8.getMessage());
        } catch (Exception e9) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e9.getMessage());
        }
    }

    public final zzoi zza(zzoi zzoiVar) throws zzbd {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    throw new zzbd(zzbb.zzc, zzba.zzau, null);
                }
                if (responseCode != 503 && responseCode != 403) {
                    if (responseCode != 404) {
                        throw new zzbd(zzbb.zzc, zzba.zzK, null);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzi, null);
                }
                throw new zzbd(zzbb.zzi, zzba.zzJ, null);
            }
            byte[] bArrM14998c = AbstractC3025a.m14998c(zzf());
            if (bArrM14998c.length == 0) {
                throw new zzbd(zzbb.zzc, zzba.zzat, null);
            }
            try {
                Object objZzb = zzoiVar.zzD().zzb(bArrM14998c);
                AbstractC6118n.m27185c(objZzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzoi) objZzb;
            } catch (Exception e7) {
                throw new zzbd(zzbb.zzc, zzba.zzG, e7.getMessage());
            }
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e8.getMessage());
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() throws zzbd {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e7) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e7.getMessage());
        } catch (IOException e8) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e8.getMessage());
        } catch (Exception e9) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e9.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) throws zzbd {
        try {
            zzg().write(bArr);
        } catch (zzbd e7) {
            throw e7;
        } catch (IOException e8) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e8.getMessage());
        } catch (Exception e9) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e9.getMessage());
        }
    }
}
