package p398y4;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.C4905b;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import p334q4.C6834a;
import p334q4.C6835b;
import p374v4.C7245j;
import p374v4.C7250o;

/* JADX INFO: renamed from: y4.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7551l {

    /* JADX INFO: renamed from: a */
    private static final char[] f30204a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: y4.l$a */
    class a implements C4905b.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TaskCompletionSource f30205a;

        a(TaskCompletionSource taskCompletionSource) {
            this.f30205a = taskCompletionSource;
        }

        @Override // com.google.firebase.database.C4905b.b
        /* JADX INFO: renamed from: a */
        public void mo22112a(C6834a c6834a, C4905b c4905b) {
            if (c6834a != null) {
                this.f30205a.setException(c6834a.m29876g());
            } else {
                this.f30205a.setResult(null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m33228a(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 == i8 ? 0 : 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m33229b(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 == j8 ? 0 : 1;
    }

    /* JADX INFO: renamed from: c */
    public static String m33230c(double d7) {
        StringBuilder sb = new StringBuilder(16);
        long jDoubleToLongBits = Double.doubleToLongBits(d7);
        for (int i7 = 7; i7 >= 0; i7--) {
            int i8 = (int) ((jDoubleToLongBits >>> (i7 * 8)) & 255);
            char[] cArr = f30204a;
            sb.append(cArr[(i8 >> 4) & 15]);
            sb.append(cArr[i8 & 15]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m33231d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: e */
    private static String m33232e(String str) {
        int iIndexOf = str.indexOf("//");
        if (iIndexOf == -1) {
            throw new C6835b("Firebase Database URL is missing URL scheme");
        }
        String strSubstring = str.substring(iIndexOf + 2);
        int iIndexOf2 = strSubstring.indexOf("/");
        if (iIndexOf2 == -1) {
            return "";
        }
        int iIndexOf3 = strSubstring.indexOf("?");
        return iIndexOf3 != -1 ? strSubstring.substring(iIndexOf2 + 1, iIndexOf3) : strSubstring.substring(iIndexOf2 + 1);
    }

    /* JADX INFO: renamed from: f */
    public static void m33233f(boolean z7) {
        m33234g(z7, "");
    }

    /* JADX INFO: renamed from: g */
    public static void m33234g(boolean z7, String str) {
        if (z7) {
            return;
        }
        Log.w("FirebaseDatabase", "Assertion failed: " + str);
    }

    /* JADX INFO: renamed from: h */
    public static C7547h m33235h(String str) {
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme == null) {
                throw new IllegalArgumentException("Database URL does not specify a URL scheme");
            }
            String host = uri.getHost();
            if (host == null) {
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            String queryParameter = uri.getQueryParameter("ns");
            if (queryParameter == null) {
                queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
            }
            C7250o c7250o = new C7250o();
            c7250o.f28959a = host.toLowerCase(Locale.US);
            int port = uri.getPort();
            if (port != -1) {
                c7250o.f28960b = scheme.equals("https") || scheme.equals("wss");
                c7250o.f28959a += ":" + port;
            } else {
                c7250o.f28960b = true;
            }
            c7250o.f28962d = c7250o.f28959a;
            c7250o.f28961c = queryParameter;
            String strReplace = m33232e(str).replace("+", " ");
            AbstractC7552m.m33245f(strReplace);
            C7547h c7547h = new C7547h();
            c7547h.f30194b = new C7245j(strReplace);
            c7547h.f30193a = c7250o;
            return c7547h;
        } catch (Exception e7) {
            throw new C6835b("Invalid Firebase Database url specified: " + str, e7);
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m33236i(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e7);
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m33237j(String str) {
        String strReplace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        return '\"' + strReplace + '\"';
    }

    /* JADX INFO: renamed from: k */
    public static Integer m33238k(String str) {
        boolean z7;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i7 = 0;
        if (str.charAt(0) == '-') {
            z7 = true;
            if (str.length() == 1) {
                return null;
            }
            i7 = 1;
        } else {
            z7 = false;
        }
        long j7 = 0;
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < '0' || cCharAt > '9') {
                return null;
            }
            j7 = (j7 * 10) + ((long) (cCharAt - '0'));
            i7++;
        }
        if (!z7) {
            if (j7 > 2147483647L) {
                return null;
            }
            return Integer.valueOf((int) j7);
        }
        long j8 = -j7;
        if (j8 < -2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j8);
    }

    /* JADX INFO: renamed from: l */
    public static C7546g m33239l(C4905b.b bVar) {
        if (bVar != null) {
            return new C7546g(null, bVar);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        return new C7546g(taskCompletionSource.getTask(), new a(taskCompletionSource));
    }
}
