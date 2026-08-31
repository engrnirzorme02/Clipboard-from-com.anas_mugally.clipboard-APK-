package p257h1;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: h1.c */
/* JADX INFO: loaded from: classes.dex */
public class C5551c {

    /* JADX INFO: renamed from: a */
    private final a f21400a;

    /* JADX INFO: renamed from: h1.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private byte[] f21401a;

        /* JADX INFO: renamed from: b */
        private int f21402b;

        /* JADX INFO: renamed from: c */
        private int f21403c;

        /* JADX INFO: renamed from: d */
        private int f21404d;

        /* JADX INFO: renamed from: e */
        private String f21405e;

        /* JADX INFO: renamed from: f */
        private String f21406f;

        /* JADX INFO: renamed from: g */
        private String f21407g;

        /* JADX INFO: renamed from: h */
        private String f21408h;

        /* JADX INFO: renamed from: i */
        private String f21409i;

        /* JADX INFO: renamed from: j */
        private String f21410j;

        /* JADX INFO: renamed from: k */
        private String f21411k;

        /* JADX INFO: renamed from: l */
        private String f21412l;

        /* JADX INFO: renamed from: m */
        private SecureRandom f21413m;

        /* JADX INFO: renamed from: n */
        private IvParameterSpec f21414n;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: A */
        public SecureRandom m24946A() {
            return this.f21413m;
        }

        /* JADX INFO: renamed from: B */
        private String m24947B() {
            return this.f21412l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public String m24960n() {
            return this.f21407g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o */
        public int m24961o() {
            return this.f21403c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public String m24962p() {
            return this.f21409i;
        }

        /* JADX INFO: renamed from: q */
        public static a m24963q(String str, String str2, byte[] bArr) {
            return new a().m24978H(bArr).m24980J(str).m24983M(str2).m24982L(128).m24981K("AES").m24975E("UTF8").m24977G(1).m24976F("SHA1").m24974D(0).m24973C("AES/CBC/PKCS5Padding").m24986P("SHA1PRNG").m24984N("PBKDF2WithHmacSHA1");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public String m24964r() {
            return this.f21411k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public int m24965s() {
            return this.f21404d;
        }

        /* JADX INFO: renamed from: t */
        private byte[] m24966t() {
            return this.f21401a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: u */
        public IvParameterSpec m24967u() {
            return this.f21414n;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public String m24968v() {
            return this.f21406f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public String m24969w() {
            return this.f21408h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: x */
        public int m24970x() {
            return this.f21402b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public String m24971y() {
            return this.f21405e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public String m24972z() {
            return this.f21410j;
        }

        /* JADX INFO: renamed from: C */
        public a m24973C(String str) {
            this.f21407g = str;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public a m24974D(int i7) {
            this.f21403c = i7;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public a m24975E(String str) {
            this.f21409i = str;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public a m24976F(String str) {
            this.f21411k = str;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public a m24977G(int i7) {
            this.f21404d = i7;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public a m24978H(byte[] bArr) {
            this.f21401a = bArr;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public a m24979I(IvParameterSpec ivParameterSpec) {
            this.f21414n = ivParameterSpec;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public a m24980J(String str) {
            this.f21406f = str;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public a m24981K(String str) {
            this.f21408h = str;
            return this;
        }

        /* JADX INFO: renamed from: L */
        public a m24982L(int i7) {
            this.f21402b = i7;
            return this;
        }

        /* JADX INFO: renamed from: M */
        public a m24983M(String str) {
            this.f21405e = str;
            return this;
        }

        /* JADX INFO: renamed from: N */
        public a m24984N(String str) {
            this.f21410j = str;
            return this;
        }

        /* JADX INFO: renamed from: O */
        public a m24985O(SecureRandom secureRandom) {
            this.f21413m = secureRandom;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public a m24986P(String str) {
            this.f21412l = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C5551c m24987m() {
            m24985O(SecureRandom.getInstance(m24947B()));
            m24979I(new IvParameterSpec(m24966t()));
            return new C5551c(this, null);
        }
    }

    /* synthetic */ C5551c(a aVar, AbstractRunnableC5550b abstractRunnableC5550b) {
        this(aVar);
    }

    /* JADX INFO: renamed from: c */
    public static C5551c m24941c(String str, String str2, byte[] bArr) {
        try {
            return a.m24963q(str, str2, bArr).m24987m();
        } catch (NoSuchAlgorithmException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private SecretKey m24942d(char[] cArr) {
        return new SecretKeySpec(SecretKeyFactory.getInstance(this.f21400a.m24972z()).generateSecret(new PBEKeySpec(cArr, this.f21400a.m24971y().getBytes(this.f21400a.m24962p()), this.f21400a.m24965s(), this.f21400a.m24970x())).getEncoded(), this.f21400a.m24969w());
    }

    /* JADX INFO: renamed from: e */
    private char[] m24943e(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(this.f21400a.m24964r());
        messageDigest.update(str.getBytes(this.f21400a.m24962p()));
        return AbstractC5549a.m24938f(messageDigest.digest(), 1).toCharArray();
    }

    /* JADX INFO: renamed from: a */
    public String m24944a(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (str == null) {
            return null;
        }
        byte[] bArrM24933a = AbstractC5549a.m24933a(str, this.f21400a.m24961o());
        SecretKey secretKeyM24942d = m24942d(m24943e(this.f21400a.m24968v()));
        Cipher cipher = Cipher.getInstance(this.f21400a.m24960n());
        cipher.init(2, secretKeyM24942d, this.f21400a.m24967u(), this.f21400a.m24946A());
        return new String(cipher.doFinal(bArrM24933a));
    }

    /* JADX INFO: renamed from: b */
    public String m24945b(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        if (str == null) {
            return null;
        }
        SecretKey secretKeyM24942d = m24942d(m24943e(this.f21400a.m24968v()));
        byte[] bytes = str.getBytes(this.f21400a.m24962p());
        Cipher cipher = Cipher.getInstance(this.f21400a.m24960n());
        cipher.init(1, secretKeyM24942d, this.f21400a.m24967u(), this.f21400a.m24946A());
        return AbstractC5549a.m24938f(cipher.doFinal(bytes), this.f21400a.m24961o());
    }

    private C5551c(a aVar) {
        this.f21400a = aVar;
    }
}
