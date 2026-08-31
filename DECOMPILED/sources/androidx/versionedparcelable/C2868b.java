package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C2390a;

/* JADX INFO: renamed from: androidx.versionedparcelable.b */
/* JADX INFO: loaded from: classes.dex */
class C2868b extends AbstractC2867a {

    /* JADX INFO: renamed from: d */
    private final SparseIntArray f11682d;

    /* JADX INFO: renamed from: e */
    private final Parcel f11683e;

    /* JADX INFO: renamed from: f */
    private final int f11684f;

    /* JADX INFO: renamed from: g */
    private final int f11685g;

    /* JADX INFO: renamed from: h */
    private final String f11686h;

    /* JADX INFO: renamed from: i */
    private int f11687i;

    /* JADX INFO: renamed from: j */
    private int f11688j;

    /* JADX INFO: renamed from: k */
    private int f11689k;

    C2868b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2390a(), new C2390a(), new C2390a());
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: A */
    public void mo14283A(byte[] bArr) {
        if (bArr == null) {
            this.f11683e.writeInt(-1);
        } else {
            this.f11683e.writeInt(bArr.length);
            this.f11683e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: C */
    protected void mo14285C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f11683e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: E */
    public void mo14287E(int i7) {
        this.f11683e.writeInt(i7);
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: G */
    public void mo14289G(Parcelable parcelable) {
        this.f11683e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: I */
    public void mo14291I(String str) {
        this.f11683e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: a */
    public void mo14296a() {
        int i7 = this.f11687i;
        if (i7 >= 0) {
            int i8 = this.f11682d.get(i7);
            int iDataPosition = this.f11683e.dataPosition();
            this.f11683e.setDataPosition(i8);
            this.f11683e.writeInt(iDataPosition - i8);
            this.f11683e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: b */
    protected AbstractC2867a mo14297b() {
        Parcel parcel = this.f11683e;
        int iDataPosition = parcel.dataPosition();
        int i7 = this.f11688j;
        if (i7 == this.f11684f) {
            i7 = this.f11685g;
        }
        return new C2868b(parcel, iDataPosition, i7, this.f11686h + "  ", this.f11679a, this.f11680b, this.f11681c);
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: g */
    public boolean mo14299g() {
        return this.f11683e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: i */
    public byte[] mo14301i() {
        int i7 = this.f11683e.readInt();
        if (i7 < 0) {
            return null;
        }
        byte[] bArr = new byte[i7];
        this.f11683e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: k */
    protected CharSequence mo14303k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f11683e);
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: m */
    public boolean mo14305m(int i7) {
        while (this.f11688j < this.f11685g) {
            int i8 = this.f11689k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            this.f11683e.setDataPosition(this.f11688j);
            int i9 = this.f11683e.readInt();
            this.f11689k = this.f11683e.readInt();
            this.f11688j += i9;
        }
        return this.f11689k == i7;
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: o */
    public int mo14307o() {
        return this.f11683e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: q */
    public Parcelable mo14309q() {
        return this.f11683e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: s */
    public String mo14311s() {
        return this.f11683e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: w */
    public void mo14315w(int i7) {
        mo14296a();
        this.f11687i = i7;
        this.f11682d.put(i7, this.f11683e.dataPosition());
        mo14287E(0);
        mo14287E(i7);
    }

    @Override // androidx.versionedparcelable.AbstractC2867a
    /* JADX INFO: renamed from: y */
    public void mo14317y(boolean z7) {
        this.f11683e.writeInt(z7 ? 1 : 0);
    }

    private C2868b(Parcel parcel, int i7, int i8, String str, C2390a c2390a, C2390a c2390a2, C2390a c2390a3) {
        super(c2390a, c2390a2, c2390a3);
        this.f11682d = new SparseIntArray();
        this.f11687i = -1;
        this.f11689k = -1;
        this.f11683e = parcel;
        this.f11684f = i7;
        this.f11685g = i8;
        this.f11688j = i7;
        this.f11686h = str;
    }
}
