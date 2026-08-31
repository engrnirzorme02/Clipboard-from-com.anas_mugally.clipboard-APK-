package okhttp3.internal.http2;

import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p072I6.C0651h;
import p072I6.InterfaceC0649f;
import p072I6.InterfaceC0650g;
import p152T5.AbstractC1631j;

/* JADX INFO: loaded from: classes.dex */
public final class Huffman {

    /* JADX INFO: renamed from: c */
    private static final byte[] f25963c;

    /* JADX INFO: renamed from: a */
    public static final Huffman f25961a = new Huffman();

    /* JADX INFO: renamed from: b */
    private static final int[] f25962b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: d */
    private static final Node f25964d = new Node();

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f25963c = bArr;
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            f25961a.m29315a(i7, f25962b[i7], f25963c[i7]);
        }
    }

    private Huffman() {
    }

    /* JADX INFO: renamed from: a */
    private final void m29315a(int i7, int i8, int i9) {
        Node node = new Node(i7, i9);
        Node node2 = f25964d;
        while (i9 > 8) {
            i9 -= 8;
            int i10 = (i8 >>> i9) & 255;
            Node[] nodeArrM29319a = node2.m29319a();
            AbstractC6118n.m27184b(nodeArrM29319a);
            Node node3 = nodeArrM29319a[i10];
            if (node3 == null) {
                node3 = new Node();
                nodeArrM29319a[i10] = node3;
            }
            node2 = node3;
        }
        int i11 = 8 - i9;
        int i12 = (i8 << i11) & 255;
        Node[] nodeArrM29319a2 = node2.m29319a();
        AbstractC6118n.m27184b(nodeArrM29319a2);
        AbstractC1631j.m6700m(nodeArrM29319a2, node, i12, (1 << i11) + i12);
    }

    /* JADX INFO: renamed from: b */
    public final void m29316b(InterfaceC0650g source, long j7, InterfaceC0649f sink) {
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(sink, "sink");
        Node node = f25964d;
        int iM28764d = 0;
        int iM29321c = 0;
        for (long j8 = 0; j8 < j7; j8++) {
            iM28764d = (iM28764d << 8) | Util.m28764d(source.readByte(), 255);
            iM29321c += 8;
            while (iM29321c >= 8) {
                Node[] nodeArrM29319a = node.m29319a();
                AbstractC6118n.m27184b(nodeArrM29319a);
                node = nodeArrM29319a[(iM28764d >>> (iM29321c - 8)) & 255];
                AbstractC6118n.m27184b(node);
                if (node.m29319a() == null) {
                    sink.mo3010F(node.m29320b());
                    iM29321c -= node.m29321c();
                    node = f25964d;
                } else {
                    iM29321c -= 8;
                }
            }
        }
        while (iM29321c > 0) {
            Node[] nodeArrM29319a2 = node.m29319a();
            AbstractC6118n.m27184b(nodeArrM29319a2);
            Node node2 = nodeArrM29319a2[(iM28764d << (8 - iM29321c)) & 255];
            AbstractC6118n.m27184b(node2);
            if (node2.m29319a() != null || node2.m29321c() > iM29321c) {
                return;
            }
            sink.mo3010F(node2.m29320b());
            iM29321c -= node2.m29321c();
            node = f25964d;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m29317c(C0651h source, InterfaceC0649f sink) {
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(sink, "sink");
        int iM3090F = source.m3090F();
        long j7 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iM3090F; i8++) {
            int iM28764d = Util.m28764d(source.m3099k(i8), 255);
            int i9 = f25962b[iM28764d];
            byte b7 = f25963c[iM28764d];
            j7 = (j7 << b7) | ((long) i9);
            i7 += b7;
            while (i7 >= 8) {
                i7 -= 8;
                sink.mo3010F((int) (j7 >> i7));
            }
        }
        if (i7 > 0) {
            sink.mo3010F((int) ((j7 << (8 - i7)) | (255 >>> i7)));
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m29318d(C0651h bytes) {
        AbstractC6118n.m27187e(bytes, "bytes");
        int iM3090F = bytes.m3090F();
        long j7 = 0;
        for (int i7 = 0; i7 < iM3090F; i7++) {
            j7 += (long) f25963c[Util.m28764d(bytes.m3099k(i7), 255)];
        }
        return (int) ((j7 + ((long) 7)) >> 3);
    }

    private static final class Node {

        /* JADX INFO: renamed from: a */
        private final Node[] f25965a;

        /* JADX INFO: renamed from: b */
        private final int f25966b;

        /* JADX INFO: renamed from: c */
        private final int f25967c;

        public Node() {
            this.f25965a = new Node[256];
            this.f25966b = 0;
            this.f25967c = 0;
        }

        /* JADX INFO: renamed from: a */
        public final Node[] m29319a() {
            return this.f25965a;
        }

        /* JADX INFO: renamed from: b */
        public final int m29320b() {
            return this.f25966b;
        }

        /* JADX INFO: renamed from: c */
        public final int m29321c() {
            return this.f25967c;
        }

        public Node(int i7, int i8) {
            this.f25965a = null;
            this.f25966b = i7;
            int i9 = i8 & 7;
            this.f25967c = i9 == 0 ? 8 : i9;
        }
    }
}
