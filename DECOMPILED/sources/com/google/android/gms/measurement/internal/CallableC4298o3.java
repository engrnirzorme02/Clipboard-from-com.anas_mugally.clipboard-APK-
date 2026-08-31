package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzht;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzie;
import com.google.android.gms.internal.measurement.zzig;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzrb;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p283k3.EnumC6051v;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o3 */
/* JADX INFO: loaded from: classes2.dex */
final class CallableC4298o3 implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4039G f15931a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15932b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ BinderC4386z3 f15933c;

    CallableC4298o3(BinderC4386z3 binderC4386z3, C4039G c4039g, String str) {
        this.f15931a = c4039g;
        this.f15932b = str;
        Objects.requireNonNull(binderC4386z3);
        this.f15933c = binderC4386z3;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x044a A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0460 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x046b A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x046f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0471 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01f5 A[Catch: all -> 0x007b, SecurityException -> 0x0213, TryCatch #0 {SecurityException -> 0x0213, blocks: (B:60:0x01ed, B:62:0x01f5, B:64:0x01fb), top: B:128:0x01ed, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0220 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0245 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x025e A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0262 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0290 A[Catch: all -> 0x007b, LOOP:1: B:85:0x028a->B:87:0x0290, LOOP_END, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x032b A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x034c A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x038a A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x03e8 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01bc, B:60:0x01ed, B:62:0x01f5, B:64:0x01fb, B:68:0x0216, B:70:0x0220, B:71:0x022d, B:72:0x023f, B:74:0x0245, B:81:0x025e, B:84:0x0283, B:85:0x028a, B:87:0x0290, B:88:0x02c4, B:90:0x032b, B:91:0x033f, B:93:0x034c, B:96:0x03a6, B:97:0x03e2, B:99:0x03e8, B:101:0x03f9, B:102:0x0404, B:104:0x044a, B:105:0x0458, B:107:0x0460, B:108:0x0463, B:110:0x046b, B:113:0x0474, B:116:0x0489, B:117:0x048c, B:112:0x0471, B:95:0x038a, B:83:0x0262, B:123:0x050c), top: B:134:0x0057, inners: #0, #2 }] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        byte[] bArr;
        C4317q6 c4317q6;
        String strM19174o0;
        C4317q6 c4317q7;
        List listM19007C0;
        Iterator it;
        C4373x6 c4373x6;
        zziu[] zziuVarArr;
        int i7;
        C4317q6 c4317q8;
        C4164X2 c4164x2;
        Bundle bundle;
        String str;
        String str2;
        C4007C c4007cM19053v0;
        C4317q6 c4317q9;
        Bundle bundle2;
        String str3;
        Object obj;
        boolean z7;
        zzhz zzhzVar;
        C4007C c4007cM18440a;
        long j7;
        zzhr zzhrVarZzk;
        C4023E c4023e;
        C4015D c4015d;
        long jM19110B0;
        long jM19196z0;
        String strM19184t0;
        zzhv zzhvVarZzn;
        Object objM18479T;
        byte[] bArr2;
        BinderC4386z3 binderC4386z3 = this.f15933c;
        binderC4386z3.m19347S0().m18896E();
        C4012C4 c4012c4M18902J0 = binderC4386z3.m19347S0().m18902J0();
        c4012c4M18902J0.mo18427h();
        C4164X2 c4164x3 = c4012c4M18902J0.f15066a;
        C4164X2.m18654q();
        C4039G c4039g = this.f15931a;
        AbstractC3718s.m18083l(c4039g);
        String str4 = this.f15932b;
        AbstractC3718s.m18077f(str4);
        String str5 = c4039g.f15219a;
        if (!"_iap".equals(str5) && !"_iapx".equals(str5)) {
            c4012c4M18902J0.f15066a.mo18421a().m18858v().m18836c("Generating a payload for this event is not available. package_name, event_name", str4, str5);
            return null;
        }
        C4317q6 c4317q10 = c4012c4M18902J0.f15465b;
        zzhz zzhzVarZzh = zzib.zzh();
        c4317q10.m18898F0().m19045r0();
        try {
            C4361w2 c4361w2M19021J0 = c4317q10.m18898F0().m19021J0(str4);
            if (c4361w2M19021J0 == null) {
                c4012c4M18902J0.f15066a.mo18421a().m18858v().m18835b("Log and bundle not available. package_name", str4);
                bArr2 = new byte[0];
            } else {
                if (c4361w2M19021J0.m19151d()) {
                    zzic zzicVarZzaE = zzid.zzaE();
                    zzicVarZzaE.zza(1);
                    zzicVarZzaE.zzC("android");
                    if (!TextUtils.isEmpty(c4361w2M19021J0.m19174o0())) {
                        zzicVarZzaE.zzL(c4361w2M19021J0.m19174o0());
                    }
                    if (!TextUtils.isEmpty(c4361w2M19021J0.m19122H0())) {
                        zzicVarZzaE.zzJ((String) AbstractC3718s.m18083l(c4361w2M19021J0.m19122H0()));
                    }
                    if (!TextUtils.isEmpty(c4361w2M19021J0.m19114D0())) {
                        zzicVarZzaE.zzM((String) AbstractC3718s.m18083l(c4361w2M19021J0.m19114D0()));
                    }
                    if (c4361w2M19021J0.m19118F0() != -2147483648L) {
                        zzicVarZzaE.zzaj((int) c4361w2M19021J0.m19118F0());
                    }
                    zzicVarZzaE.zzN(c4361w2M19021J0.m19126J0());
                    zzicVarZzaE.zzar(c4361w2M19021J0.m19147b());
                    String strM19180r0 = c4361w2M19021J0.m19180r0();
                    if (!TextUtils.isEmpty(strM19180r0)) {
                        zzicVarZzaE.zzad(strM19180r0);
                    }
                    zzicVarZzaE.zzay(c4361w2M19021J0.m19142X());
                    C4027E3 c4027e3M18920g = c4012c4M18902J0.f15465b.m18920g(str4);
                    zzicVarZzaE.zzY(c4361w2M19021J0.m19130L0());
                    if (c4164x3.m18675g() && c4012c4M18902J0.f15066a.m18686w().m18813k(zzicVarZzaE.zzK()) && c4027e3M18920g.m18514o(EnumC6051v.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzicVarZzaE.zzam(null);
                    }
                    zzicVarZzaE.zzat(c4027e3M18920g.m18511k());
                    if (c4027e3M18920g.m18514o(EnumC6051v.AD_STORAGE) && c4361w2M19021J0.m19134P()) {
                        Pair pairM19330m = c4317q10.m18904L0().m19330m(c4361w2M19021J0.m19174o0(), c4027e3M18920g);
                        if (!c4361w2M19021J0.m19134P() || TextUtils.isEmpty((CharSequence) pairM19330m.first)) {
                            C4164X2 c4164x4 = c4012c4M18902J0.f15066a;
                            c4164x4.m18669K().m18437l();
                            zzicVarZzaE.zzF(Build.MODEL);
                            c4164x4.m18669K().m18437l();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) c4164x4.m18669K().m18417o());
                            zzicVarZzaE.zzH(c4164x4.m18669K().m18418p());
                            if (c4027e3M18920g.m18514o(EnumC6051v.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW(C4012C4.m18456m((String) AbstractC3718s.m18083l(c4361w2M19021J0.m19176p0()), Long.toString(c4039g.f15222d)));
                            }
                            if (!TextUtils.isEmpty(c4361w2M19021J0.m19192x0())) {
                                zzicVarZzaE.zzah((String) AbstractC3718s.m18083l(c4361w2M19021J0.m19192x0()));
                            }
                            strM19174o0 = c4361w2M19021J0.m19174o0();
                            c4317q7 = c4012c4M18902J0.f15465b;
                            listM19007C0 = c4317q7.m18898F0().m19007C0(strM19174o0);
                            it = listM19007C0.iterator();
                            do {
                                if (!it.hasNext()) {
                                    c4373x6 = null;
                                    break;
                                }
                                c4373x6 = (C4373x6) it.next();
                            } while (!"_lte".equals(c4373x6.f16230c));
                            if (c4373x6 != null) {
                                C4373x6 c4373x7 = new C4373x6(strM19174o0, "auto", "_lte", c4012c4M18902J0.f15066a.mo18425f().mo18159a(), 0L);
                                listM19007C0.add(c4373x7);
                                c4317q7.m18898F0().m19003A0(c4373x7);
                            } else {
                                C4373x6 c4373x8 = new C4373x6(strM19174o0, "auto", "_lte", c4012c4M18902J0.f15066a.mo18425f().mo18159a(), 0L);
                                listM19007C0.add(c4373x8);
                                c4317q7.m18898F0().m19003A0(c4373x8);
                            }
                            zziuVarArr = new zziu[listM19007C0.size()];
                            for (i7 = 0; i7 < listM19007C0.size(); i7++) {
                                zzit zzitVarZzm = zziu.zzm();
                                zzitVarZzm.zzb(((C4373x6) listM19007C0.get(i7)).f16230c);
                                zzitVarZzm.zza(((C4373x6) listM19007C0.get(i7)).f16231d);
                                c4317q7.m18903K0().m19086G(zzitVarZzm, ((C4373x6) listM19007C0.get(i7)).f16232e);
                                zziuVarArr[i7] = (zziu) zzitVarZzm.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            c4317q8 = c4012c4M18902J0.f15465b;
                            c4317q8.m18934n(c4361w2M19021J0, zzicVarZzaE);
                            c4317q8.m18936o(c4361w2M19021J0, zzicVarZzaE);
                            C4321r2 c4321r2M18959a = C4321r2.m18959a(c4039g);
                            c4164x2 = c4012c4M18902J0.f15066a;
                            C4389z6 c4389z6M18661C = c4164x2.m18661C();
                            bundle = c4321r2M18959a.f16028d;
                            c4389z6M18661C.m19413w(bundle, c4317q7.m18898F0().m19014G(str4));
                            c4164x2.m18661C().m19409u(c4321r2M18959a, c4164x2.m18686w().m18819w(str4));
                            bundle.putLong("_c", 1L);
                            c4164x2.mo18421a().m18858v().m18834a("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = c4039g.f15221c;
                            bundle.putString("_o", str);
                            if (c4164x2.m18661C().m19380P(zzicVarZzaE.zzK(), c4361w2M19021J0.m19168l0())) {
                                c4164x2.m18661C().m19367A(bundle, "_dbg", 1L);
                                c4164x2.m18661C().m19367A(bundle, "_r", 1L);
                            }
                            C4342u c4342uM18898F0 = c4317q7.m18898F0();
                            str2 = c4039g.f15219a;
                            c4007cM19053v0 = c4342uM18898F0.m19053v0(str4, str2);
                            if (c4007cM19053v0 == null) {
                                c4317q9 = c4317q8;
                                obj = null;
                                z7 = true;
                                str3 = str;
                                bundle2 = bundle;
                                c4007cM18440a = new C4007C(str4, str2, 0L, 0L, 0L, c4039g.f15222d, 0L, null, null, null, null);
                                j7 = 0;
                                zzhzVar = zzhzVarZzh;
                            } else {
                                c4317q9 = c4317q8;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z7 = true;
                                zzhzVar = zzhzVarZzh;
                                long j8 = c4007cM19053v0.f15132f;
                                c4007cM18440a = c4007cM19053v0.m18440a(c4039g.f15222d);
                                j7 = j8;
                            }
                            C4007C c4007c = c4007cM18440a;
                            c4317q7.m18898F0().m19055w0(c4007c);
                            C4317q6 c4317q11 = c4317q9;
                            boolean z8 = z7;
                            C3999B c3999b = new C3999B(c4012c4M18902J0.f15066a, str3, str4, str2, c4039g.f15222d, j7, bundle2);
                            zzhrVarZzk = zzhs.zzk();
                            zzhrVarZzk.zzo(c3999b.f15083d);
                            zzhrVarZzk.zzl(c3999b.f15081b);
                            zzhrVarZzk.zzq(c3999b.f15084e);
                            c4023e = c3999b.f15085f;
                            c4015d = new C4015D(c4023e);
                            while (c4015d.hasNext()) {
                                String next = c4015d.next();
                                zzhvVarZzn = zzhw.zzn();
                                zzhvVarZzn.zzb(next);
                                objM18479T = c4023e.m18479T(next);
                                if (objM18479T != null) {
                                    c4317q7.m18903K0().m19087H(zzhvVarZzn, objM18479T);
                                    zzhrVarZzk.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzk);
                            zzie zzieVarZza = zzig.zza();
                            zzht zzhtVarZza = zzhu.zza();
                            zzhtVarZza.zzb(c4007c.f15129c);
                            zzhtVarZza.zza(str2);
                            zzieVarZza.zza(zzhtVarZza);
                            zzicVarZzaE.zzap(zzieVarZza);
                            zzicVarZzaE.zzaf(c4317q7.m18901I0().m18723m(c4361w2M19021J0.m19174o0(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                            if (zzhrVarZzk.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzk.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzk.zzn());
                            }
                            jM19110B0 = c4361w2M19021J0.m19110B0();
                            if (jM19110B0 != 0) {
                                zzicVarZzaE.zzA(jM19110B0);
                            }
                            jM19196z0 = c4361w2M19021J0.m19196z0();
                            if (jM19196z0 != 0) {
                                zzicVarZzaE.zzy(jM19196z0);
                            } else if (jM19110B0 != 0) {
                                zzicVarZzaE.zzy(jM19110B0);
                            }
                            strM19184t0 = c4361w2M19021J0.m19184t0();
                            zzrb.zza();
                            if (c4164x2.m18686w().m18800H(str4, AbstractC4209d2.f15623N0)) {
                                zzicVarZzaE.zzau(strM19184t0);
                            }
                            c4361w2M19021J0.m19167l();
                            zzicVarZzaE.zzZ((int) c4361w2M19021J0.m19157g());
                            c4164x2.m18686w().m18793A();
                            zzicVarZzaE.zzO(133005L);
                            zzicVarZzaE.zzs(c4164x2.mo18425f().mo18159a());
                            zzicVarZzaE.zzae(z8);
                            c4317q11.m18953x(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar.zze(zzicVarZzaE);
                            c4361w2M19021J0.m19108A0(zzicVarZzaE.zzu());
                            c4361w2M19021J0.m19112C0(zzicVarZzaE.zzw());
                            c4317q7.m18898F0().m19023K0(c4361w2M19021J0, false, false);
                            c4317q7.m18898F0().m19047s0();
                            c4317q7.m18898F0().m19049t0();
                            return c4317q7.m18903K0().m19098V(((zzib) zzhzVar.zzbc()).zzcc());
                        }
                        try {
                            zzicVarZzaE.zzQ(C4012C4.m18456m((String) pairM19330m.first, Long.toString(c4039g.f15222d)));
                            Object obj2 = pairM19330m.second;
                            if (obj2 != null) {
                                zzicVarZzaE.zzT(((Boolean) obj2).booleanValue());
                            }
                            C4164X2 c4164x5 = c4012c4M18902J0.f15066a;
                            c4164x5.m18669K().m18437l();
                            zzicVarZzaE.zzF(Build.MODEL);
                            c4164x5.m18669K().m18437l();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) c4164x5.m18669K().m18417o());
                            zzicVarZzaE.zzH(c4164x5.m18669K().m18418p());
                            if (c4027e3M18920g.m18514o(EnumC6051v.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW(C4012C4.m18456m((String) AbstractC3718s.m18083l(c4361w2M19021J0.m19176p0()), Long.toString(c4039g.f15222d)));
                            }
                            if (!TextUtils.isEmpty(c4361w2M19021J0.m19192x0())) {
                                zzicVarZzaE.zzah((String) AbstractC3718s.m18083l(c4361w2M19021J0.m19192x0()));
                            }
                            strM19174o0 = c4361w2M19021J0.m19174o0();
                            c4317q7 = c4012c4M18902J0.f15465b;
                            listM19007C0 = c4317q7.m18898F0().m19007C0(strM19174o0);
                            it = listM19007C0.iterator();
                            do {
                                if (!it.hasNext()) {
                                    c4373x6 = null;
                                    break;
                                }
                                c4373x6 = (C4373x6) it.next();
                            } while (!"_lte".equals(c4373x6.f16230c));
                            if (c4373x6 != null) {
                                C4373x6 c4373x9 = new C4373x6(strM19174o0, "auto", "_lte", c4012c4M18902J0.f15066a.mo18425f().mo18159a(), 0L);
                                listM19007C0.add(c4373x9);
                                c4317q7.m18898F0().m19003A0(c4373x9);
                            } else {
                                C4373x6 c4373x10 = new C4373x6(strM19174o0, "auto", "_lte", c4012c4M18902J0.f15066a.mo18425f().mo18159a(), 0L);
                                listM19007C0.add(c4373x10);
                                c4317q7.m18898F0().m19003A0(c4373x10);
                            }
                            zziuVarArr = new zziu[listM19007C0.size()];
                            while (i7 < listM19007C0.size()) {
                                zzit zzitVarZzm2 = zziu.zzm();
                                zzitVarZzm2.zzb(((C4373x6) listM19007C0.get(i7)).f16230c);
                                zzitVarZzm2.zza(((C4373x6) listM19007C0.get(i7)).f16231d);
                                c4317q7.m18903K0().m19086G(zzitVarZzm2, ((C4373x6) listM19007C0.get(i7)).f16232e);
                                zziuVarArr[i7] = (zziu) zzitVarZzm2.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            c4317q8 = c4012c4M18902J0.f15465b;
                            c4317q8.m18934n(c4361w2M19021J0, zzicVarZzaE);
                            c4317q8.m18936o(c4361w2M19021J0, zzicVarZzaE);
                            C4321r2 c4321r2M18959a2 = C4321r2.m18959a(c4039g);
                            c4164x2 = c4012c4M18902J0.f15066a;
                            C4389z6 c4389z6M18661C2 = c4164x2.m18661C();
                            bundle = c4321r2M18959a2.f16028d;
                            c4389z6M18661C2.m19413w(bundle, c4317q7.m18898F0().m19014G(str4));
                            c4164x2.m18661C().m19409u(c4321r2M18959a2, c4164x2.m18686w().m18819w(str4));
                            bundle.putLong("_c", 1L);
                            c4164x2.mo18421a().m18858v().m18834a("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = c4039g.f15221c;
                            bundle.putString("_o", str);
                            if (c4164x2.m18661C().m19380P(zzicVarZzaE.zzK(), c4361w2M19021J0.m19168l0())) {
                                c4164x2.m18661C().m19367A(bundle, "_dbg", 1L);
                                c4164x2.m18661C().m19367A(bundle, "_r", 1L);
                            }
                            C4342u c4342uM18898F1 = c4317q7.m18898F0();
                            str2 = c4039g.f15219a;
                            c4007cM19053v0 = c4342uM18898F1.m19053v0(str4, str2);
                            if (c4007cM19053v0 == null) {
                                c4317q9 = c4317q8;
                                obj = null;
                                z7 = true;
                                str3 = str;
                                bundle2 = bundle;
                                c4007cM18440a = new C4007C(str4, str2, 0L, 0L, 0L, c4039g.f15222d, 0L, null, null, null, null);
                                j7 = 0;
                                zzhzVar = zzhzVarZzh;
                            } else {
                                c4317q9 = c4317q8;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z7 = true;
                                zzhzVar = zzhzVarZzh;
                                long j9 = c4007cM19053v0.f15132f;
                                c4007cM18440a = c4007cM19053v0.m18440a(c4039g.f15222d);
                                j7 = j9;
                            }
                            C4007C c4007c2 = c4007cM18440a;
                            c4317q7.m18898F0().m19055w0(c4007c2);
                            C4317q6 c4317q12 = c4317q9;
                            boolean z9 = z7;
                            C3999B c3999b2 = new C3999B(c4012c4M18902J0.f15066a, str3, str4, str2, c4039g.f15222d, j7, bundle2);
                            zzhrVarZzk = zzhs.zzk();
                            zzhrVarZzk.zzo(c3999b2.f15083d);
                            zzhrVarZzk.zzl(c3999b2.f15081b);
                            zzhrVarZzk.zzq(c3999b2.f15084e);
                            c4023e = c3999b2.f15085f;
                            c4015d = new C4015D(c4023e);
                            while (c4015d.hasNext()) {
                                String next2 = c4015d.next();
                                zzhvVarZzn = zzhw.zzn();
                                zzhvVarZzn.zzb(next2);
                                objM18479T = c4023e.m18479T(next2);
                                if (objM18479T != null) {
                                    c4317q7.m18903K0().m19087H(zzhvVarZzn, objM18479T);
                                    zzhrVarZzk.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzk);
                            zzie zzieVarZza2 = zzig.zza();
                            zzht zzhtVarZza2 = zzhu.zza();
                            zzhtVarZza2.zzb(c4007c2.f15129c);
                            zzhtVarZza2.zza(str2);
                            zzieVarZza2.zza(zzhtVarZza2);
                            zzicVarZzaE.zzap(zzieVarZza2);
                            zzicVarZzaE.zzaf(c4317q7.m18901I0().m18723m(c4361w2M19021J0.m19174o0(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                            if (zzhrVarZzk.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzk.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzk.zzn());
                            }
                            jM19110B0 = c4361w2M19021J0.m19110B0();
                            if (jM19110B0 != 0) {
                                zzicVarZzaE.zzA(jM19110B0);
                            }
                            jM19196z0 = c4361w2M19021J0.m19196z0();
                            if (jM19196z0 != 0) {
                                zzicVarZzaE.zzy(jM19196z0);
                            } else if (jM19110B0 != 0) {
                                zzicVarZzaE.zzy(jM19110B0);
                            }
                            strM19184t0 = c4361w2M19021J0.m19184t0();
                            zzrb.zza();
                            if (c4164x2.m18686w().m18800H(str4, AbstractC4209d2.f15623N0)) {
                                zzicVarZzaE.zzau(strM19184t0);
                            }
                            c4361w2M19021J0.m19167l();
                            zzicVarZzaE.zzZ((int) c4361w2M19021J0.m19157g());
                            c4164x2.m18686w().m18793A();
                            zzicVarZzaE.zzO(133005L);
                            zzicVarZzaE.zzs(c4164x2.mo18425f().mo18159a());
                            zzicVarZzaE.zzae(z9);
                            c4317q12.m18953x(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar.zze(zzicVarZzaE);
                            c4361w2M19021J0.m19108A0(zzicVarZzaE.zzu());
                            c4361w2M19021J0.m19112C0(zzicVarZzaE.zzw());
                            c4317q7.m18898F0().m19023K0(c4361w2M19021J0, false, false);
                            c4317q7.m18898F0().m19047s0();
                            c4317q7.m18898F0().m19049t0();
                            return c4317q7.m18903K0().m19098V(((zzib) zzhzVar.zzbc()).zzcc());
                        } catch (SecurityException e7) {
                            c4012c4M18902J0.f15066a.mo18421a().m18858v().m18835b("Resettable device id encryption failed", e7.getMessage());
                            bArr = new byte[0];
                            c4317q6 = c4012c4M18902J0.f15465b;
                        }
                    } else {
                        C4164X2 c4164x6 = c4012c4M18902J0.f15066a;
                        c4164x6.m18669K().m18437l();
                        zzicVarZzaE.zzF(Build.MODEL);
                        c4164x6.m18669K().m18437l();
                        zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                        zzicVarZzaE.zzI((int) c4164x6.m18669K().m18417o());
                        zzicVarZzaE.zzH(c4164x6.m18669K().m18418p());
                        try {
                            if (c4027e3M18920g.m18514o(EnumC6051v.ANALYTICS_STORAGE) && c4361w2M19021J0.m19176p0() != null) {
                                zzicVarZzaE.zzW(C4012C4.m18456m((String) AbstractC3718s.m18083l(c4361w2M19021J0.m19176p0()), Long.toString(c4039g.f15222d)));
                            }
                            if (!TextUtils.isEmpty(c4361w2M19021J0.m19192x0())) {
                                zzicVarZzaE.zzah((String) AbstractC3718s.m18083l(c4361w2M19021J0.m19192x0()));
                            }
                            strM19174o0 = c4361w2M19021J0.m19174o0();
                            c4317q7 = c4012c4M18902J0.f15465b;
                            listM19007C0 = c4317q7.m18898F0().m19007C0(strM19174o0);
                            it = listM19007C0.iterator();
                            do {
                                if (!it.hasNext()) {
                                    c4373x6 = null;
                                    break;
                                }
                                c4373x6 = (C4373x6) it.next();
                            } while (!"_lte".equals(c4373x6.f16230c));
                            if (c4373x6 != null || c4373x6.f16232e == null) {
                                C4373x6 c4373x11 = new C4373x6(strM19174o0, "auto", "_lte", c4012c4M18902J0.f15066a.mo18425f().mo18159a(), 0L);
                                listM19007C0.add(c4373x11);
                                c4317q7.m18898F0().m19003A0(c4373x11);
                            }
                            zziuVarArr = new zziu[listM19007C0.size()];
                            while (i7 < listM19007C0.size()) {
                                zzit zzitVarZzm3 = zziu.zzm();
                                zzitVarZzm3.zzb(((C4373x6) listM19007C0.get(i7)).f16230c);
                                zzitVarZzm3.zza(((C4373x6) listM19007C0.get(i7)).f16231d);
                                c4317q7.m18903K0().m19086G(zzitVarZzm3, ((C4373x6) listM19007C0.get(i7)).f16232e);
                                zziuVarArr[i7] = (zziu) zzitVarZzm3.zzbc();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            c4317q8 = c4012c4M18902J0.f15465b;
                            c4317q8.m18934n(c4361w2M19021J0, zzicVarZzaE);
                            c4317q8.m18936o(c4361w2M19021J0, zzicVarZzaE);
                            C4321r2 c4321r2M18959a3 = C4321r2.m18959a(c4039g);
                            c4164x2 = c4012c4M18902J0.f15066a;
                            C4389z6 c4389z6M18661C3 = c4164x2.m18661C();
                            bundle = c4321r2M18959a3.f16028d;
                            c4389z6M18661C3.m19413w(bundle, c4317q7.m18898F0().m19014G(str4));
                            c4164x2.m18661C().m19409u(c4321r2M18959a3, c4164x2.m18686w().m18819w(str4));
                            bundle.putLong("_c", 1L);
                            c4164x2.mo18421a().m18858v().m18834a("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = c4039g.f15221c;
                            bundle.putString("_o", str);
                            if (c4164x2.m18661C().m19380P(zzicVarZzaE.zzK(), c4361w2M19021J0.m19168l0())) {
                                c4164x2.m18661C().m19367A(bundle, "_dbg", 1L);
                                c4164x2.m18661C().m19367A(bundle, "_r", 1L);
                            }
                            C4342u c4342uM18898F2 = c4317q7.m18898F0();
                            str2 = c4039g.f15219a;
                            c4007cM19053v0 = c4342uM18898F2.m19053v0(str4, str2);
                            if (c4007cM19053v0 == null) {
                                c4317q9 = c4317q8;
                                obj = null;
                                z7 = true;
                                str3 = str;
                                bundle2 = bundle;
                                c4007cM18440a = new C4007C(str4, str2, 0L, 0L, 0L, c4039g.f15222d, 0L, null, null, null, null);
                                j7 = 0;
                                zzhzVar = zzhzVarZzh;
                            } else {
                                c4317q9 = c4317q8;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z7 = true;
                                zzhzVar = zzhzVarZzh;
                                long j10 = c4007cM19053v0.f15132f;
                                c4007cM18440a = c4007cM19053v0.m18440a(c4039g.f15222d);
                                j7 = j10;
                            }
                            C4007C c4007c3 = c4007cM18440a;
                            c4317q7.m18898F0().m19055w0(c4007c3);
                            C4317q6 c4317q13 = c4317q9;
                            boolean z10 = z7;
                            C3999B c3999b3 = new C3999B(c4012c4M18902J0.f15066a, str3, str4, str2, c4039g.f15222d, j7, bundle2);
                            zzhrVarZzk = zzhs.zzk();
                            zzhrVarZzk.zzo(c3999b3.f15083d);
                            zzhrVarZzk.zzl(c3999b3.f15081b);
                            zzhrVarZzk.zzq(c3999b3.f15084e);
                            c4023e = c3999b3.f15085f;
                            c4015d = new C4015D(c4023e);
                            while (c4015d.hasNext()) {
                                String next3 = c4015d.next();
                                zzhvVarZzn = zzhw.zzn();
                                zzhvVarZzn.zzb(next3);
                                objM18479T = c4023e.m18479T(next3);
                                if (objM18479T != null) {
                                    c4317q7.m18903K0().m19087H(zzhvVarZzn, objM18479T);
                                    zzhrVarZzk.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzk);
                            zzie zzieVarZza3 = zzig.zza();
                            zzht zzhtVarZza3 = zzhu.zza();
                            zzhtVarZza3.zzb(c4007c3.f15129c);
                            zzhtVarZza3.zza(str2);
                            zzieVarZza3.zza(zzhtVarZza3);
                            zzicVarZzaE.zzap(zzieVarZza3);
                            zzicVarZzaE.zzaf(c4317q7.m18901I0().m18723m(c4361w2M19021J0.m19174o0(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzk.zzn()), Long.valueOf(zzhrVarZzk.zzn()), false));
                            if (zzhrVarZzk.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzk.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzk.zzn());
                            }
                            jM19110B0 = c4361w2M19021J0.m19110B0();
                            if (jM19110B0 != 0) {
                                zzicVarZzaE.zzA(jM19110B0);
                            }
                            jM19196z0 = c4361w2M19021J0.m19196z0();
                            if (jM19196z0 != 0) {
                                zzicVarZzaE.zzy(jM19196z0);
                            } else if (jM19110B0 != 0) {
                                zzicVarZzaE.zzy(jM19110B0);
                            }
                            strM19184t0 = c4361w2M19021J0.m19184t0();
                            zzrb.zza();
                            if (c4164x2.m18686w().m18800H(str4, AbstractC4209d2.f15623N0) && strM19184t0 != null) {
                                zzicVarZzaE.zzau(strM19184t0);
                            }
                            c4361w2M19021J0.m19167l();
                            zzicVarZzaE.zzZ((int) c4361w2M19021J0.m19157g());
                            c4164x2.m18686w().m18793A();
                            zzicVarZzaE.zzO(133005L);
                            zzicVarZzaE.zzs(c4164x2.mo18425f().mo18159a());
                            zzicVarZzaE.zzae(z10);
                            c4317q13.m18953x(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar.zze(zzicVarZzaE);
                            c4361w2M19021J0.m19108A0(zzicVarZzaE.zzu());
                            c4361w2M19021J0.m19112C0(zzicVarZzaE.zzw());
                            c4317q7.m18898F0().m19023K0(c4361w2M19021J0, false, false);
                            c4317q7.m18898F0().m19047s0();
                            c4317q7.m18898F0().m19049t0();
                            try {
                                return c4317q7.m18903K0().m19098V(((zzib) zzhzVar.zzbc()).zzcc());
                            } catch (IOException e8) {
                                c4012c4M18902J0.f15066a.mo18421a().m18851o().m18836c("Data loss. Failed to bundle and serialize. appId", C4313q2.m18846x(str4), e8);
                                return obj;
                            }
                        } catch (SecurityException e9) {
                            c4012c4M18902J0.f15066a.mo18421a().m18858v().m18835b("app instance id encryption failed", e9.getMessage());
                            bArr = new byte[0];
                            c4317q6 = c4012c4M18902J0.f15465b;
                        }
                    }
                    c4317q6.m18898F0().m19049t0();
                    return bArr;
                }
                c4012c4M18902J0.f15066a.mo18421a().m18858v().m18835b("Log and bundle disabled. package_name", str4);
                bArr2 = new byte[0];
            }
            c4317q10.m18898F0().m19049t0();
            return bArr2;
        } catch (Throwable th) {
            c4012c4M18902J0.f15465b.m18898F0().m19049t0();
            throw th;
        }
    }
}
