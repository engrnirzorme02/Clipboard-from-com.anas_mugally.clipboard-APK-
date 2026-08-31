package p099M1;

import com.bumptech.glide.load.data.InterfaceC3220e;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: M1.a */
/* JADX INFO: loaded from: classes.dex */
public class C0884a implements InterfaceC3220e {

    /* JADX INFO: renamed from: a */
    private final ByteBuffer f3474a;

    /* JADX INFO: renamed from: M1.a$a */
    public static class a implements InterfaceC3220e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC3220e.a
        /* JADX INFO: renamed from: a */
        public Class mo4043a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3220e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC3220e mo4044b(ByteBuffer byteBuffer) {
            return new C0884a(byteBuffer);
        }
    }

    public C0884a(ByteBuffer byteBuffer) {
        this.f3474a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3220e
    /* JADX INFO: renamed from: b */
    public void mo4041b() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3220e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo4040a() {
        this.f3474a.position(0);
        return this.f3474a;
    }
}
