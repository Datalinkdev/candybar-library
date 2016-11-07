package com.dm.material.dashboard.candybar.items;

/*
 * CandyBar - Material Dashboard
 *
 * Copyright (c) 2014-present Dani Mahardhika
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class Icon {

    private String mTitle;
    private int mRes;
    private int mCount;

    public Icon(String title, int res) {
        mTitle = title;
        mRes = res;
    }

    public Icon(String title, int res, int count) {
        mTitle = title;
        mRes = res;
        mCount = count;
    }

    public String getTitle() {
        return mTitle;
    }

    public int getRes() {
        return mRes;
    }

    public int getCount() {
        return mCount;
    }

}
