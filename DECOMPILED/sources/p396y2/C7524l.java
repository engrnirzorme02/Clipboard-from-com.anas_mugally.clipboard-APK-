package p396y2;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: y2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7524l extends AbstractC1945a {
    public static final Parcelable.Creator<C7524l> CREATOR = new C7523k();

    /* JADX INFO: renamed from: a */
    public final String f30127a;

    /* JADX INFO: renamed from: b */
    public final String f30128b;

    /* JADX INFO: renamed from: c */
    public final String f30129c;

    /* JADX INFO: renamed from: d */
    public final String f30130d;

    /* JADX INFO: renamed from: e */
    public final String f30131e;

    /* JADX INFO: renamed from: f */
    public final String f30132f;

    /* JADX INFO: renamed from: r */
    public final String f30133r;

    /* JADX INFO: renamed from: s */
    public final Intent f30134s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC7512G f30135t;

    /* JADX INFO: renamed from: u */
    public final boolean f30136u;

    public C7524l(Intent intent, InterfaceC7512G interfaceC7512G) {
        this(null, null, null, null, null, null, null, intent, BinderC3773b.m18221N0(interfaceC7512G).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f30127a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, str, false);
        AbstractC1947c.m8044E(parcel, 3, this.f30128b, false);
        AbstractC1947c.m8044E(parcel, 4, this.f30129c, false);
        AbstractC1947c.m8044E(parcel, 5, this.f30130d, false);
        AbstractC1947c.m8044E(parcel, 6, this.f30131e, false);
        AbstractC1947c.m8044E(parcel, 7, this.f30132f, false);
        AbstractC1947c.m8044E(parcel, 8, this.f30133r, false);
        AbstractC1947c.m8042C(parcel, 9, this.f30134s, i7, false);
        AbstractC1947c.m8071s(parcel, 10, BinderC3773b.m18221N0(this.f30135t).asBinder(), false);
        AbstractC1947c.m8059g(parcel, 11, this.f30136u);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public C7524l(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z7) {
        this.f30127a = str;
        this.f30128b = str2;
        this.f30129c = str3;
        this.f30130d = str4;
        this.f30131e = str5;
        this.f30132f = str6;
        this.f30133r = str7;
        this.f30134s = intent;
        this.f30135t = (InterfaceC7512G) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder));
        this.f30136u = z7;
    }

    public C7524l(String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC7512G interfaceC7512G) {
        this(str, str2, str3, str4, str5, str6, str7, null, BinderC3773b.m18221N0(interfaceC7512G).asBinder(), false);
    }
}
