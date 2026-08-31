package p038E4;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: E4.a */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0382a {

    /* JADX INFO: renamed from: E4.a$a */
    static class a implements b {

        /* JADX INFO: renamed from: b */
        private int f1534b = 0;

        /* JADX INFO: renamed from: a */
        private List f1533a = new ArrayList();

        a() {
        }

        @Override // p038E4.AbstractC0382a.b
        /* JADX INFO: renamed from: a */
        public boolean mo1615a(byte[] bArr) {
            this.f1533a.add(bArr);
            this.f1534b += bArr.length;
            return true;
        }

        @Override // p038E4.AbstractC0382a.b
        /* JADX INFO: renamed from: b */
        public C0388g mo1616b() {
            byte[] bArr = new byte[this.f1534b];
            int length = 0;
            for (int i7 = 0; i7 < this.f1533a.size(); i7++) {
                byte[] bArr2 = (byte[]) this.f1533a.get(i7);
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return new C0388g(bArr);
        }
    }

    /* JADX INFO: renamed from: E4.a$b */
    interface b {
        /* JADX INFO: renamed from: a */
        boolean mo1615a(byte[] bArr);

        /* JADX INFO: renamed from: b */
        C0388g mo1616b();
    }

    /* JADX INFO: renamed from: E4.a$c */
    static class c implements b {

        /* JADX INFO: renamed from: c */
        private static ThreadLocal f1535c = new a();

        /* JADX INFO: renamed from: d */
        private static ThreadLocal f1536d = new b();

        /* JADX INFO: renamed from: a */
        private StringBuilder f1537a = new StringBuilder();

        /* JADX INFO: renamed from: b */
        private ByteBuffer f1538b;

        /* JADX INFO: renamed from: E4.a$c$a */
        class a extends ThreadLocal {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CharsetDecoder initialValue() {
                CharsetDecoder charsetDecoderNewDecoder = Charset.forName("UTF8").newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                charsetDecoderNewDecoder.onMalformedInput(codingErrorAction);
                charsetDecoderNewDecoder.onUnmappableCharacter(codingErrorAction);
                return charsetDecoderNewDecoder;
            }
        }

        /* JADX INFO: renamed from: E4.a$c$b */
        class b extends ThreadLocal {
            b() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CharsetEncoder initialValue() {
                CharsetEncoder charsetEncoderNewEncoder = Charset.forName("UTF8").newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                charsetEncoderNewEncoder.onMalformedInput(codingErrorAction);
                charsetEncoderNewEncoder.onUnmappableCharacter(codingErrorAction);
                return charsetEncoderNewEncoder;
            }
        }

        c() {
        }

        /* JADX INFO: renamed from: c */
        private String m1617c(byte[] bArr) {
            try {
                return ((CharsetDecoder) f1535c.get()).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException unused) {
                return null;
            }
        }

        @Override // p038E4.AbstractC0382a.b
        /* JADX INFO: renamed from: a */
        public boolean mo1615a(byte[] bArr) {
            String strM1617c = m1617c(bArr);
            if (strM1617c == null) {
                return false;
            }
            this.f1537a.append(strM1617c);
            return true;
        }

        @Override // p038E4.AbstractC0382a.b
        /* JADX INFO: renamed from: b */
        public C0388g mo1616b() {
            if (this.f1538b != null) {
                return null;
            }
            return new C0388g(this.f1537a.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    static b m1614a(byte b7) {
        return b7 == 2 ? new a() : new c();
    }
}
