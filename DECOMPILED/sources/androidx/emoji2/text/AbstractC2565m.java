package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p232e0.C5251b;

/* JADX INFO: renamed from: androidx.emoji2.text.m */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2565m {

    /* JADX INFO: renamed from: androidx.emoji2.text.m$a */
    private static class a implements c {

        /* JADX INFO: renamed from: a */
        private final ByteBuffer f9886a;

        a(ByteBuffer byteBuffer) {
            this.f9886a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.AbstractC2565m.c
        /* JADX INFO: renamed from: a */
        public int mo11819a() {
            return this.f9886a.getInt();
        }

        @Override // androidx.emoji2.text.AbstractC2565m.c
        /* JADX INFO: renamed from: b */
        public void mo11820b(int i7) {
            ByteBuffer byteBuffer = this.f9886a;
            byteBuffer.position(byteBuffer.position() + i7);
        }

        @Override // androidx.emoji2.text.AbstractC2565m.c
        /* JADX INFO: renamed from: c */
        public long mo11821c() {
            return AbstractC2565m.m11817c(this.f9886a.getInt());
        }

        @Override // androidx.emoji2.text.AbstractC2565m.c
        public long getPosition() {
            return this.f9886a.position();
        }

        @Override // androidx.emoji2.text.AbstractC2565m.c
        public int readUnsignedShort() {
            return AbstractC2565m.m11818d(this.f9886a.getShort());
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.m$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final long f9887a;

        /* JADX INFO: renamed from: b */
        private final long f9888b;

        b(long j7, long j8) {
            this.f9887a = j7;
            this.f9888b = j8;
        }

        /* JADX INFO: renamed from: a */
        long m11822a() {
            return this.f9887a;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.m$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        int mo11819a();

        /* JADX INFO: renamed from: b */
        void mo11820b(int i7);

        /* JADX INFO: renamed from: c */
        long mo11821c();

        long getPosition();

        int readUnsignedShort();
    }

    /* JADX INFO: renamed from: a */
    private static b m11815a(c cVar) throws IOException {
        long jMo11821c;
        cVar.mo11820b(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.mo11820b(6);
        int i7 = 0;
        while (true) {
            if (i7 >= unsignedShort) {
                jMo11821c = -1;
                break;
            }
            int iMo11819a = cVar.mo11819a();
            cVar.mo11820b(4);
            jMo11821c = cVar.mo11821c();
            cVar.mo11820b(4);
            if (1835365473 == iMo11819a) {
                break;
            }
            i7++;
        }
        if (jMo11821c != -1) {
            cVar.mo11820b((int) (jMo11821c - cVar.getPosition()));
            cVar.mo11820b(12);
            long jMo11821c2 = cVar.mo11821c();
            for (int i8 = 0; i8 < jMo11821c2; i8++) {
                int iMo11819a2 = cVar.mo11819a();
                long jMo11821c3 = cVar.mo11821c();
                long jMo11821c4 = cVar.mo11821c();
                if (1164798569 == iMo11819a2 || 1701669481 == iMo11819a2) {
                    return new b(jMo11821c3 + jMo11821c, jMo11821c4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: b */
    static C5251b m11816b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) m11815a(new a(byteBufferDuplicate)).m11822a());
        return C5251b.m24256h(byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: c */
    static long m11817c(int i7) {
        return ((long) i7) & 4294967295L;
    }

    /* JADX INFO: renamed from: d */
    static int m11818d(short s7) {
        return s7 & 65535;
    }
}
