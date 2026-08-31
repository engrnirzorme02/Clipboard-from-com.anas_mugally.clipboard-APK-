package p252g4;

import java.io.File;
import java.io.IOException;
import p228d4.C5235g;
import p300m4.C6346g;

/* JADX INFO: renamed from: g4.x */
/* JADX INFO: loaded from: classes.dex */
class C5514x {

    /* JADX INFO: renamed from: a */
    private final String f20935a;

    /* JADX INFO: renamed from: b */
    private final C6346g f20936b;

    public C5514x(String str, C6346g c6346g) {
        this.f20935a = str;
        this.f20936b = c6346g;
    }

    /* JADX INFO: renamed from: b */
    private File m24893b() {
        return this.f20936b.m27340g(this.f20935a);
    }

    /* JADX INFO: renamed from: a */
    public boolean m24894a() {
        try {
            return m24893b().createNewFile();
        } catch (IOException e7) {
            C5235g.m24179f().m24183e("Error creating marker: " + this.f20935a, e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m24895c() {
        return m24893b().exists();
    }

    /* JADX INFO: renamed from: d */
    public boolean m24896d() {
        return m24893b().delete();
    }
}
