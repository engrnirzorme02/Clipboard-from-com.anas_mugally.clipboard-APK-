package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.d0 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5095d0 implements AbstractC5063B.a {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: d */
    private static final AbstractC5063B.b f19384d = new AbstractC5063B.b() { // from class: com.google.protobuf.d0.a
    };

    /* JADX INFO: renamed from: a */
    private final int f19386a;

    EnumC5095d0(int i7) {
        this.f19386a = i7;
    }

    @Override // com.google.protobuf.AbstractC5063B.a
    /* JADX INFO: renamed from: a */
    public final int mo22846a() {
        if (this != UNRECOGNIZED) {
            return this.f19386a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
