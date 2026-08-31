package p232e0;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: e0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5252c {

    /* JADX INFO: renamed from: a */
    protected int f20002a;

    /* JADX INFO: renamed from: b */
    protected ByteBuffer f20003b;

    /* JADX INFO: renamed from: c */
    private int f20004c;

    /* JADX INFO: renamed from: d */
    private int f20005d;

    /* JADX INFO: renamed from: e */
    AbstractC5253d f20006e = AbstractC5253d.m24268a();

    /* JADX INFO: renamed from: a */
    protected int m24263a(int i7) {
        return i7 + this.f20003b.getInt(i7);
    }

    /* JADX INFO: renamed from: b */
    protected int m24264b(int i7) {
        if (i7 < this.f20005d) {
            return this.f20003b.getShort(this.f20004c + i7);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    protected void m24265c(int i7, ByteBuffer byteBuffer) {
        this.f20003b = byteBuffer;
        if (byteBuffer == null) {
            this.f20002a = 0;
            this.f20004c = 0;
            this.f20005d = 0;
        } else {
            this.f20002a = i7;
            int i8 = i7 - byteBuffer.getInt(i7);
            this.f20004c = i8;
            this.f20005d = this.f20003b.getShort(i8);
        }
    }

    /* JADX INFO: renamed from: d */
    protected int m24266d(int i7) {
        int i8 = i7 + this.f20002a;
        return i8 + this.f20003b.getInt(i8) + 4;
    }

    /* JADX INFO: renamed from: e */
    protected int m24267e(int i7) {
        int i8 = i7 + this.f20002a;
        return this.f20003b.getInt(i8 + this.f20003b.getInt(i8));
    }
}
